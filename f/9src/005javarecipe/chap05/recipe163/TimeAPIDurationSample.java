package jp.co.shoeisha.javarecipe.chapter05.recipe163;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeAPIDurationSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Durationインスタンスを生成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 3日間
			Duration duration1 = Duration.ofDays(3);
			System.out.println(duration1);
			// 2時間
			Duration duration2 = Duration.ofHours(2);
			System.out.println(duration2);
			// 30分
			Duration duration3 = Duration.ofMinutes(30);
			System.out.println(duration3);
			// 10秒
			Duration duration4 = Duration.ofSeconds(10);
			System.out.println(duration4);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 期間を日付に加算・減算する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 2014年12月8日を表わすLocalDateインスタンスを生成
			LocalDateTime dateTime = LocalDateTime.of(2014, 12, 8,0,0);
			System.out.println(dateTime);
			// 3日間を表わすDurationを生成
			Duration duration = Duration.ofDays(3);
			System.out.println(duration);
			// LocalDateにDurationを加算
			LocalDateTime result = dateTime.plus(duration); // => 2014-12-11
			System.out.println(result);
		}
	}

}
