package jp.co.shoeisha.javarecipe.chapter07.recipe215;

import java.util.concurrent.TimeUnit;

public class SampleRunnable implements Runnable {

	@Override
	public void run() {

		try {
			TimeUnit.SECONDS.sleep(2);

			System.out.println("Runnableを使った非同期処理");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
