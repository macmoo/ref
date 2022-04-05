package jp.co.shoeisha.javarecipe.chapter07.recipe219;

public class Task extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("非同期処理の終了");
	}

}
