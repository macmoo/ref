package jp.co.shoeisha.javarecipe.chapter05.recipe162;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class String2TimeAPISample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// デフォルトのフォーマットでパースする
		/////////////////////////////////////////////////////////////////////////////
		{
			// "2007-12-03T10:15:30"のような文字列からLocalDateTimeを生成
			LocalDateTime dateTime = LocalDateTime.parse("2013-12-24T12:00");
			System.out.println(dateTime);
			// "2007-12-03"のような文字列からLocalDateを生成
			LocalDate date = LocalDate.parse("2013-12-25");
			System.out.println(date);
			// "2007-12-03T10:15:30+01:00"のような文字列からOffsetDateTimeを生成
			OffsetDateTime offsetDateTime = OffsetDateTime.parse("2014-01-01T00:00:00+01:00");
			System.out.println(offsetDateTime);
			// "2007-12-03T10:15:30+01:00[Europe/Paris]"のような文字列からZonedDateTimeを生成
			ZonedDateTime zonedDateTime =
					ZonedDateTime.parse("2014-01-01T00:11:10+09:00[Asia/Tokyo]");
			System.out.println(zonedDateTime);
		}
		/////////////////////////////////////////////////////////////////////////////
		// フォーマットを指定してパースする
		/////////////////////////////////////////////////////////////////////////////
		{
			// フォーマットを指定してDateTimeFormatterを生成
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			// "yyyy/MM/dd HH:mm"形式の文字列からLocalDateTimeを生成
			LocalDateTime dateTime = LocalDateTime.parse("2013/12/31 00:00", formatter);
			System.out.println(dateTime);
		}

	}

}
