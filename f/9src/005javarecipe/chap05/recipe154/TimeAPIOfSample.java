package jp.co.shoeisha.javarecipe.chapter05.recipe154;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeAPIOfSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// LocalDateTime/LocalDate/LocalTimeで日時を指定
		/////////////////////////////////////////////////////////////////////////////
		{
			// 年月日などを指定（秒、ナノ秒は省略可能）
			LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 12, 12, 5); // => 2014-03-12T12:05
			System.out.println(dateTime1);
			LocalDateTime dateTime2 = LocalDateTime.of(2014, 3, 12, 12, 5, 20, 100); // => 2014-03-12T12:05:20.000000100
			System.out.println(dateTime2);
			// 日付のみ
			LocalDate date = LocalDate.of(2014, 3, 12); // => 2014-03-12
			System.out.println(date);
			// 時刻のみ（秒、ナノ秒は省略可能）
			LocalTime time = LocalTime.of(12, 5); // => 12:05
			System.out.println(time);
			// LocalDateとLocalTimeからLocalDateTimeを取得
			LocalDateTime dateTime3 = LocalDateTime.of(date, time); // => 2014-03-12T12:05
			System.out.println(dateTime3);
		}
		/////////////////////////////////////////////////////////////////////////////
		// タイムゾーンや時差を指定して日付を取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			// デフォルトのタイムゾーンで日時を取得
			ZonedDateTime zoned1 = ZonedDateTime.of(2014, 3, 12, 12, 5, 20, 100,
					ZoneId.systemDefault()); // => 2014-03-12T12:05:20.000000100+09:00[Asia/Tokyo]
			System.out.println(zoned1);
			// 時差-9時間を持つ日時を取得
			OffsetDateTime offset = OffsetDateTime.of(2014, 3, 12, 12, 5, 20, 100,
					ZoneOffset.ofHours(-9)); // => 2014-03-12T12:05:20.000000100-09:00
			System.out.println(offset);
			// LocalDateTimeからZonedDateTimeやOffsetDateTimeを取得することも可能
			LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 12, 12, 5);
			ZonedDateTime zoned2 = ZonedDateTime.of(dateTime1,
					ZoneId.of("America/New_York")); // => 2014-03-12T12:05-04:00[America/New_York]
			System.out.println(zoned2);
		}

	}

}
