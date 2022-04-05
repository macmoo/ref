package jp.co.shoeisha.javarecipe.chapter05.recipe158;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// ISO-8601形式の文字列にフォーマットする
		/////////////////////////////////////////////////////////////////////////////
		{
			LocalDateTime local = LocalDateTime.now();
			System.out.println(local);
			// 日付文字列にフォーマット
			String format1 = local.format(DateTimeFormatter.ISO_DATE); // => 2014-03-22
			System.out.println(format1);
			// 日時文字列にフォーマット
			String format2 = local.format(DateTimeFormatter.ISO_DATE_TIME); // => 2014-03-22T14:35:58.722
			System.out.println(format2);

			ZonedDateTime zoned = ZonedDateTime.now();
			// ZonedDateTimeは時差やタイムゾーンの情報も含まれる
			String format3 = zoned.format(DateTimeFormatter.ISO_DATE); // => 2014-03-22+09:00
			System.out.println(format3);
			String format4 = zoned.format(DateTimeFormatter.ISO_DATE_TIME); // => 2014-03-22T14:35:58.722+09:00[Asia/Tokyo]
			System.out.println(format4);
		}
		/////////////////////////////////////////////////////////////////////////////
		// フォーマットパターンを指定する
		/////////////////////////////////////////////////////////////////////////////
		{
			// フォーマットを指定してDateTimeFormatterを生成
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			LocalDateTime dateTime = LocalDateTime.now();
			System.out.println(dateTime);
			// 文字列にフォーマット
			String format = dateTime.format(formatter); // => 2014/03/22 12:05
			System.out.println(format);
		}
		/////////////////////////////////////////////////////////////////////////////
		// ロケール固有の文字列にフォーマットする
		/////////////////////////////////////////////////////////////////////////////
		{
			LocalDateTime local = LocalDateTime.now();
			System.out.println(local);
			// ロケール固有の日付フォーマットを生成
			DateTimeFormatter style1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
			String format1 = local.format(style1); // => 2014年3月22日
			System.out.println(format1);
			ZonedDateTime zoned = ZonedDateTime.now();
			System.out.println(zoned);
			// ロケール固有の日時フォーマットを生成
			DateTimeFormatter style2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
			String format2 = zoned.format(style2); // => 2014年3月22日 16時38分45秒 JST
			System.out.println(format2);
		}
	}

}
