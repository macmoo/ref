package jp.co.shoeisha.javarecipe.chapter07.recipe236;

import java.util.concurrent.TimeUnit;

public class MainSample {

	public static void main(String[] args) {

		LockCondition condition = new LockCondition();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					String str = condition.get();
					System.out.println("取得: " + str);

					TimeUnit.SECONDS.sleep(5);

					System.out.println("開放: " + str);
					condition.add(str);

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
