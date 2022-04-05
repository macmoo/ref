package jp.co.shoeisha.javarecipe.chapter05.recipe155;

import java.time.LocalDateTime;

public class TimeAPIWithSample {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		// 時分秒ナノ秒をすべて0に設定
		LocalDateTime result1 = localDateTime
				.withHour(0)
				.withMinute(0)
				.withSecond(0)
				.withNano(0); // => 2014-03-24T00:00
		System.out.println(result1);
		// 2016年2月に設定（月は1 〜12で指定）
		LocalDateTime result2 = localDateTime
				.withYear(2016)
				.withMonth(2); // => 2016-02-24T04:47:19.424
		System.out.println(result2);
	}

}
