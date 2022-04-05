package jp.co.shoeisha.javarecipe.chapter05.recipe161;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TimeAPILastDayOfManthSample {

	public static void main(String[] args) {
		// 2014年2月の最終日を取得
		LocalDate localDate1 = LocalDate.of(2014, 2, 1);
		LocalDate endDate1 = localDate1.with(TemporalAdjusters.lastDayOfMonth()); // => 2014-02-28
		System.out.println(endDate1);
		// 2016年2月（うるう年）の最終日を取得
		LocalDate localDate2 = LocalDate.of(2016, 2, 1);
		LocalDate endDate2 = localDate2.with(TemporalAdjusters.lastDayOfMonth()); // => 2016-02-29
		System.out.println(endDate2);
	}

}
