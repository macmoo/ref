package jp.co.shoeisha.javarecipe.chapter07.recipe235;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSample {

	private final Lock lock = new ReentrantLock();

	public void method() {
		try {
			// ロックを取得。取得できるまで待機する
			lock.lock();
			System.out.println("ロックを取得: " + Thread.currentThread().getName());

			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} finally {
			System.out.println("ロックを解放: " + Thread.currentThread().getName());

			// ロックを解放。必ずfinallyで行なう
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		LockSample sample = new LockSample();

		Runnable r = new Runnable() {
			@Override
		    public void run() {
				sample.method();
			}
		};

		new Thread(r).start();
		new Thread(r).start();
	}

}
