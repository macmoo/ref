package jp.co.shoeisha.javarecipe.chapter05.recipe145;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class CurrentTimeMillisSample {

	public static void main(String[] args) {
		 // 現在日時をUNIX時間で取得
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);

		// 24時間後のUNIX時間を計算
		long nextDay = currentTime + (1000 * 60 * 60 * 24);
		System.out.println(nextDay);

		// Dateに設定
		Date date = new Date(nextDay);
		System.out.println(date);

		// Calendarに設定
		Calendar cal = Calendar.getInstance(); cal.setTimeInMillis(nextDay);
		System.out.println(cal);

		// ZonedDateTimeに設定
		ZonedDateTime dateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(nextDay), ZoneId.of("UTC"));
		System.out.println(dateTime);
	}

}
