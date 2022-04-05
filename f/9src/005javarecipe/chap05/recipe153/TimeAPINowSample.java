package jp.co.shoeisha.javarecipe.chapter05.recipe153;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeAPINowSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// LocalDateTime/LocalDate/LocalTimeで現在日時を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// 現在日時を生成
			LocalDateTime localDateTime = LocalDateTime.now(); // => 2013-08-11T15:31:11.703
			System.out.println(localDateTime);
			// 現在日を生成
			LocalDate localDate = LocalDate.now(); // => 2013-08-11
			System.out.println(localDate);
			// 現在時刻を生成
			LocalTime localTime = LocalTime.now(); // => 15:31:11.707
			System.out.println(localTime);
		}
		/////////////////////////////////////////////////////////////////////////////
		// OffsetDateTimeやZonedDateTimeを保持して現在日時を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			OffsetDateTime offsetDateTime = OffsetDateTime.now(); // => 2014-03-29T13:20:11.607+09:00
			System.out.println(offsetDateTime);
			ZonedDateTime zonedDateTime = ZonedDateTime.now(); // => 2014-03-29T13:20:11.607+09:00[Asia/Tokyo]
			System.out.println(zonedDateTime);
		}
		/////////////////////////////////////////////////////////////////////////////
		// TimeZoneを指定して現在日時を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("America/New_York")); // => 2013-10-26T23:46:49.621-04:00[America/New_York]
			System.out.println(dateTime);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Clockを指定して現在日時を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// 常にエポックタイムを返すシステムクロック
			Clock mock = Clock.fixed(Instant.EPOCH, ZoneId.systemDefault());
			MyBean bean = new MyBean(mock);
			LocalDateTime current = bean.current(); // => 1970-01-01T09:00
			System.out.println(current);

			// デフォルトのタイムゾーンを使用
			Clock jpClock = Clock.systemDefaultZone();
			MyBean bean2 = new MyBean(jpClock);
			LocalDateTime current2 = bean2.current(); // => 2014-04-06T10:45:07.294
			System.out.println(current2);

			// タイムゾーンを指定
			Clock usClock = Clock.system(ZoneId.of("America/New_York"));
			MyBean bean3 = new MyBean(usClock);
			LocalDateTime current3 = bean3.current(); // => 2014-04-06T10:45:07.294
			System.out.println(current3);
		}

	}

}
