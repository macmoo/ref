package jp.co.shoeisha.javarecipe.chapter05.recipe166;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeAPI2Date {

	public static void main(String[] args) {
		// ZonedDateTimeで現在日時を生成
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		// Instantに変換
		Instant instant = now.toInstant();
		// InstantからDateに変換
		Date dateNow = Date.from(instant); // =>Sun Oct 27 13:46:36 JST 2013
		System.out.println(dateNow);

		// LocalDateTimeで現在日時を生成
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		// ZoneOffsetを指定してInstantに変換
		Instant instant2 = now2.toInstant(ZoneOffset.ofHours(-9));
		Date dateNow2 = Date.from(instant2);
		System.out.println(dateNow2);

		// LocalDateTimeで現在日時を生成
		LocalDateTime local = LocalDateTime.now();
		System.out.println(local);
		//タイムゾーンを指定してZonedDateTimeを生成
		ZonedDateTime zoned = local.atZone(ZoneId.systemDefault());
		//Dateに変換
		Date date = Date.from(zoned.toInstant());
		System.out.println(date);
	}

}
