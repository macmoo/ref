package jp.co.shoeisha.javarecipe.chapter07.recipe232;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchThread extends Thread {

	private long time;
	private CountDownLatch counter;

	public CountDownLatchThread(long time, CountDownLatch counter){
		this.time = time;
		this.counter = counter;
	}

	@Override
	public void run() {
		try {
			// コンストラクタで指定されたミリ秒待機
			Thread.sleep(this.time);

			// カウントダウン
			this.counter.countDown();
			System.out.println(getName() + ": Wait");

			// カウンタが0になるまで待機
			this.counter.await();
			System.out.println(getName() + ": End");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 3スレッドで待ち合わせを行なうCountDownLatchを生成
		CountDownLatch counter = new CountDownLatch(3);

		// 待機時間の異なる3つのスレッドを実行
		new CountDownLatchThread(1000, counter).start();
		new CountDownLatchThread(2000, counter).start();
		new CountDownLatchThread(3000, counter).start();
	}

}
