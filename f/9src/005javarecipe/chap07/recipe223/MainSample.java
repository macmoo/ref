package jp.co.shoeisha.javarecipe.chapter07.recipe223;

import java.util.Calendar;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MainSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// 指定した時刻に一度だけ実行
		/////////////////////////////////////////////////////////////////////////////
		{
			Timer timer = new Timer();

			// タイマーを起動する時間
			Calendar cal = Calendar.getInstance();
			cal.set(2014, Calendar.MAY, 1, 12, 0);

			// 2014年5月1日12時に一度だけ実行
			timer.schedule(new SampleTask(timer), cal.getTime());
		}

		/////////////////////////////////////////////////////////////////////////////
		// 一定時間後に一度だけ実行
		/////////////////////////////////////////////////////////////////////////////
		{
			Timer timer = new Timer();

			// 1分後に一度だけ実行
			timer.schedule(new SampleTask(timer), TimeUnit.MINUTES.toMillis(1));
		}

	}

}
