package jp.co.shoeisha.javarecipe.chapter07.recipe223;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class SampleTask extends TimerTask {

	private Timer timer;

	public SampleTask(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(2);

			System.out.println("タイマーを使った処理");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 破棄
		timer.cancel();
	}

}
