package jp.co.shoeisha.javarecipe.chapter05.recipe156;

import java.time.LocalDateTime;

public class TimeAPIGetSample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2014, 3, 12, 12, 5, 20);
		// 年
		int year = dateTime.getYear(); // => 2014
		System.out.println(year);
		// 月
		int month = dateTime.getMonthValue(); // => 3
		System.out.println(month);
		// 日
		int day = dateTime.getDayOfMonth(); // => 12
		System.out.println(day);
		// 時
		int hour = dateTime.getHour(); // => 12
		System.out.println(hour);
		// 分
		int minute = dateTime.getMinute(); // => 5
		System.out.println(minute);
		// 秒
		int second = dateTime.getSecond(); // => 20
		System.out.println(second);
	}

}
