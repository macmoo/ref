package jp.co.shoeisha.javarecipe.chapter05.recipe165;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Date2TimeAPISample {

	public static void main(String[] args) {
		// 現在日時を生成
		Date nowDate = new Date();
		System.out.println(nowDate);
		// 現在日時をjava.time.Instantに変換
		Instant instant = nowDate.toInstant();
		// InstantからZonedDateTimeに変換
		ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println(dateTime);

		// atZone ( )メソッドを使ってZonedDateTimeに変換
		ZonedDateTime dateTime2 = instant.atZone(ZoneId.systemDefault());
		System.out.println(dateTime2);

		// atOffset ( )メソッドを使ってOffsetDateTimeに変換
		OffsetDateTime dateTime3 = instant.atOffset(ZoneOffset.ofHours(-9));
		System.out.println(dateTime3);
	}

}
