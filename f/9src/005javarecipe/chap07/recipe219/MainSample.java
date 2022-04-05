package jp.co.shoeisha.javarecipe.chapter07.recipe219;

public class MainSample {

	public static void main(String[] args) throws InterruptedException {
		Task thread = new Task();

		// スレッド開始
		thread.start();

		// スレッドが終了するまで待機
		thread.join();

		// スレッド終了
		System.out.println("メイン処理を再開");

	}

}
