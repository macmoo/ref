package jp.co.shoeisha.javarecipe.chapter07.recipe237;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BBSSample {

	private static ReadWriteLock lock = new ReentrantReadWriteLock();

	private String value;

	public void update() {
		// 書き込み用のロックを取得
		Lock writelock = lock.writeLock();

		try {
			writelock.lock();

			// 値を更新
			this.value = Thread.currentThread().getName() + new Date();

		} finally {
			writelock.unlock();
		}
	}

	public String find() {
		// 読み込み用のロックを取得
		Lock readlock = lock.readLock();

		try {
			readlock.lock();

			return value;

		} finally {
			readlock.unlock();
		}
	}

}
