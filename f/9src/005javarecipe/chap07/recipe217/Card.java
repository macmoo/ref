package jp.co.shoeisha.javarecipe.chapter07.recipe217;

import java.util.concurrent.TimeUnit;

public class Card {

	private long balance = 1000;

	public void draw(long amount) {

		// this（自分自身のインスタンス）のロックを取得した1スレッドのみ実行できる
		synchronized(this) {
			System.out.println("ロックを取得: " + balance);

			balance -= amount;

			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("ロックを開放: " + balance);
		}

	}

	public long getBalance() {
		return balance;
	}

}
