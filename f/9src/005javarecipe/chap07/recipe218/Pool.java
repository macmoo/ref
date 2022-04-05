package jp.co.shoeisha.javarecipe.chapter07.recipe218;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pool {

	List<String> pool = new LinkedList<>(Arrays.asList(
			"one", "two", "three", "four", "five"));

	public synchronized String get() throws InterruptedException {
		// Listが空の場合
		while (pool.size() == 0) {
			// notifyAll()メソッドが実行されるまで待機
			wait();
		}
		return pool.remove(0);
	}

	public synchronized void add(String value) {
		pool.add(value);

		// wait()メソッドによって待機しているスレッドを再開
		notifyAll();
	}

}
