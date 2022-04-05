package jp.co.shoeisha.javarecipe.chapter07.recipe220;

import java.util.concurrent.TimeUnit;

public class SleepSample {

	public static void main(String[] args) throws InterruptedException {

		/////////////////////////////////////////////////////////////////////////////
		// 一時停止
		/////////////////////////////////////////////////////////////////////////////

		// 5秒停止する。ミリ秒指定
		Thread.sleep(5000);

		// 5秒停止する
		TimeUnit.SECONDS.sleep(5);

		// 1分停止する
		TimeUnit.MINUTES.sleep(1);

		/////////////////////////////////////////////////////////////////////////////
		// 時間の単位を変換
		/////////////////////////////////////////////////////////////////////////////

		// 1時間をミリ秒に変換
		long millis = TimeUnit.HOURS.toMillis(1);
		System.out.println(millis);

		// 90分を秒に変換
		long seconds = TimeUnit.MINUTES.toSeconds(90);
		System.out.println(seconds);

		// 12日を時間に変換
		long hours = TimeUnit.DAYS.toHours(12);
		System.out.println(hours);

	}

}
