package jp.co.shoeisha.javarecipe.chapter07.recipe225;

public class TestThread extends Thread {

	@Override
	public void run() {
		// スレッドの開始時にスレッド名を表示
		System.out.println(getName() + ": Start");

		try {
			// 5秒待機する
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// スレッドの終了時にスレッド名を表示
		System.out.println(getName() + ": End");
	}

}
