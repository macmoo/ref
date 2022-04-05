package jp.co.shoeisha.javarecipe.chapter07.recipe215;

import java.util.concurrent.TimeUnit;

public class SampleThread extends Thread {

	@Override
	public void run() {

		try {
			TimeUnit.SECONDS.sleep(2);

			System.out.println("Threadを使った非同期処理");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
