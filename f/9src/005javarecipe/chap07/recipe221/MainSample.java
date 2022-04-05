package jp.co.shoeisha.javarecipe.chapter07.recipe221;

public class MainSample {

	public static void main(String[] args) {

		Task thread = new Task();

		// スレッド開始
		thread.start();

		int random = (int)(Math.random() * 10);
		System.out.println(random);

		if(random > 5) {
			// タスクをキャンセルする
			thread.interrupt();
		}

	}

}
