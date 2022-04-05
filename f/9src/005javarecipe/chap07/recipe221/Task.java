package jp.co.shoeisha.javarecipe.chapter07.recipe221;

public class Task extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			System.out.println("スレッドの待機をキャンセルされました");
		}
	}

}
