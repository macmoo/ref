package jp.co.shoeisha.javarecipe.chapter07.recipe230;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread {

	private Semaphore semaphore;

	public SemaphoreThread(Semaphore semaphore){
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			// セマフォを取得
			this.semaphore.acquire();

			// スレッド名を表示
			System.out.println(getName());

			// 5秒待機
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// セマフォを解放
			this.semaphore.release();
		}
	}

	public static void main(String[] args) {
		// 3スレッドまで同時に実行可能なセマフォを生成
		Semaphore semaphore = new Semaphore(3);

		// 5つのスレッドを同時に開始
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
	}

}
