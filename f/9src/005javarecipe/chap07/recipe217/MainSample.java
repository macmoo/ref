package jp.co.shoeisha.javarecipe.chapter07.recipe217;

import java.util.concurrent.TimeUnit;

public class MainSample {

	public static void main(String[] args) throws InterruptedException {

		Card card = new Card();

		/////////////////////////////////////////////////////////////////////////////
		// 自分自身のインスタンスを排他制御
		/////////////////////////////////////////////////////////////////////////////
		{
			Runnable r = new Runnable() {
				@Override
				public void run() {
					card.draw(100);
				}
			};

			Thread thread1 = new Thread(r);
			thread1.start();
			Thread thread2 = new Thread(r);
			thread2.start();
		}

		TimeUnit.SECONDS.sleep(10);

		/////////////////////////////////////////////////////////////////////////////
		// 任意のインスタンスを排他制御
		/////////////////////////////////////////////////////////////////////////////
		{
			Thread thread1 = new DrawThread(card);
			thread1.start();
			Thread thread2 = new DrawThread(card);
			thread2.start();
		}

	}

}
