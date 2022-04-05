package jp.co.shoeisha.javarecipe.chapter07.recipe215;

public class MainSample {

	public static void main(String[] args) {

		System.out.println("メイン処理開始");
		{
			SampleThread thread = new SampleThread();
			thread.start();
		}

		{
			Thread thread = new Thread(new SampleRunnable());
			thread.start();
		}
		System.out.println("メイン処理終了");

	}

}
