package jp.co.shoeisha.javarecipe.chapter07.recipe218;

import java.util.concurrent.TimeUnit;

public class MainSample {

	public static void main(String[] args) {

		Pool pool = new Pool();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					String str = pool.get();
					System.out.println("取得: " + str);

					TimeUnit.SECONDS.sleep(5);

					System.out.println("開放: " + str);
					pool.add(str);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread(r);
			thread.start();
		}

	}

}
