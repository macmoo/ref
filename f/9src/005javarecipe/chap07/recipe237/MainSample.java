package jp.co.shoeisha.javarecipe.chapter07.recipe237;

public class MainSample {

	public static void main(String[] args) throws InterruptedException {

		BBSSample bbs = new BBSSample();

		// 書き込み
		Runnable write = new Runnable() {
			@Override
			public void run() {
				bbs.update();
			}
		};

		// 読み込み
		Runnable read = new Runnable() {
			@Override
			public void run() {
				System.out.println(bbs.find());
			}
		};

		// 書き込みと読み込みを交互に行う
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				new Thread(read).start();
			} else {
				new Thread(write).start();
			}

			Thread.sleep(100);
		}

	}

}
