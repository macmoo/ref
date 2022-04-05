package jp.co.shoeisha.javarecipe.chapter07.recipe222;

public class MainSample {

	public static void main(String[] args) throws InterruptedException {

		Count count = new Count();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				count.increment();
			}
		};

		for(int i = 0; i < 1000; i++) {
			Thread thread = new Thread(r);
			thread.start();
		}

		Thread.sleep(1000);
		System.out.println(count.toString());
	}

}
