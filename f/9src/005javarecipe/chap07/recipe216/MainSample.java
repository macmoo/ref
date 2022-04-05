package jp.co.shoeisha.javarecipe.chapter07.recipe216;

public class MainSample {

	public static void main(String[] args) {

		Thread thread = new Thread() {
			@Override
			public void run() {
				throw new RuntimeException();
			}
		};

		thread.setUncaughtExceptionHandler(new MyHandler());

		thread.start();
	}

}
