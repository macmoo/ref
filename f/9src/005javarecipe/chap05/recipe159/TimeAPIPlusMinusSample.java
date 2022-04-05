package jp.co.shoeisha.javarecipe.chapter05.recipe159;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeAPIPlusMinusSample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2013, 12, 8, 0, 0);
		System.out.println(dateTime);
		// 4年3 ヶ月後
		LocalDateTime result1 = dateTime.plusYears(4).plusMonths(3); // => 2018-03-08T00:00
		System.out.println(result1);
		// 10日後
		LocalDateTime result2 = dateTime.plusDays(10); // => 2013-12-18T00:00
		System.out.println(result2);
		// 5時間30分後
		LocalDateTime result3 = dateTime.plusHours(5).plusMinutes(30); // => 2013-12-08T05:30
		System.out.println(result3);
		// 30日前
		LocalDateTime result4 = dateTime.minusDays(30); // => 2013-11-08T00:00
		System.out.println(result4);
		// 1分30秒前
		LocalDateTime result5 = dateTime.minusMinutes(1).minusSeconds(30); // => 2013-12-07T23:58:30
		System.out.println(result5);
		// 3週間前
		LocalDateTime result6 = dateTime.minusWeeks(3); // => 2013-11-17T00:00
		System.out.println(result6);
		// 5年後
		LocalDateTime result7 = dateTime.plus(5, ChronoUnit.YEARS); // => 2018-12-08T00:00
		System.out.println(result7);
		// 6 ヶ月前
		LocalDateTime result8 = dateTime.minus(6, ChronoUnit.MONTHS); // => 2013-06-08T00:00
		System.out.println(result8);
	}

}
