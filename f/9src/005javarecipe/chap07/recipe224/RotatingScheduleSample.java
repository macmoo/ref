package jp.co.shoeisha.javarecipe.chapter07.recipe224;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class RotatingScheduleSample {

	public static void main(String[] args) throws InterruptedException {
		// デーモンスレッドで実行
		Timer timer = new Timer(true);

		Calendar cal = Calendar.getInstance();
		cal.set(2014, Calendar.MAY, 1, 12, 0);

		// 2014年5月1日12時に起動し、1分間隔で繰り返し実行
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("繰り返しタイマー" + new Date());
			}
		}, cal.getTime(), TimeUnit.MINUTES.toMillis(1));

		TimeUnit.MINUTES.sleep(5);

	}

}
