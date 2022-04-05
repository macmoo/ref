package jp.co.shoeisha.javarecipe.chapter05.recipe157;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class TimeAPIConvertSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// LocalDateTime/LocalDate/LocalTimeを相互に変換
		/////////////////////////////////////////////////////////////////////////////
		{
			LocalDateTime dateTime1 = LocalDateTime.now();
			System.out.println(dateTime1);
			// LocalDateTimeをLocalDateに変換
			LocalDate date = dateTime1.toLocalDate();
			System.out.println(date);
			// LocalDateTimeをLocalTimeに変換
			LocalTime time = dateTime1.toLocalTime();
			System.out.println(time);
			// LocalDateをLocalDateTimeに変換
			// LocalDateは日付しか持っていないので時間を指定する必要がある
			LocalDateTime dateTime2 = date.atTime(0, 0);
			System.out.println(dateTime2);
			LocalDateTime dateTime3 = date.atTime(LocalTime.of(0, 0));
			System.out.println(dateTime3);
			// LocalTimeをLocalDateTimeに変換
			// LocalTimeは時間しか持っていないので日付を指定する必要がある
			LocalDateTime dateTime4 = time.atDate(LocalDate.of(2013, 12, 8));
			System.out.println(dateTime4);
		}
		/////////////////////////////////////////////////////////////////////////////
		// ZonedDateTimeをLocalDateTime/LocalDate/LocalTimeを変換
		/////////////////////////////////////////////////////////////////////////////
		{
			ZonedDateTime zoned = ZonedDateTime.now();
			System.out.println(zoned);
			// ZonedDateTimeをLocalDateTime、LocalDate、LocalTimeに変換
			LocalDateTime dateTime = zoned.toLocalDateTime();
			System.out.println(dateTime);
			LocalDate date = zoned.toLocalDate();
			System.out.println(date);
			LocalTime time = zoned.toLocalTime();
			System.out.println(time);
		}

	}

}
