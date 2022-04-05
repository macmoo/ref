package jp.co.shoeisha.javarecipe.chapter07.recipe236;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCondition {

	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();

	List<String> pool = new LinkedList<>(Arrays.asList(
			"one", "two", "three", "four", "five"));

	public String get() throws InterruptedException {
		try {
			lock.lock();

			// Listが空の場合は待機
			while (pool.size() == 0) {
				condition.await();
			}

			return pool.remove(0);

		} finally {
			lock.unlock();
		}
	}

	public void add(String value) {
		try {
			lock.lock();

			pool.add(value);

			// 待機しているスレッドを再開
			condition.signalAll();

		} finally {
			lock.unlock();
		}
	}

}
