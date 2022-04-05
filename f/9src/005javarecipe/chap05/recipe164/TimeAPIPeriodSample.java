package jp.co.shoeisha.javarecipe.chapter05.recipe164;

import java.time.LocalDate;
import java.time.Period;

public class TimeAPIPeriodSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// TimeAPIで2つの日付の間隔を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			// 2つの日を生成
			LocalDate date1 = LocalDate.of(2014, 7, 12);
			LocalDate date2 = LocalDate.of(2015, 10, 20);
			// 間隔を取得
			Period period = Period.between(date1, date2);
			// 年数を取得
			int years = period.getYears(); // => 1
			System.out.println(years);
			// 月数を取得
			int months = period.getMonths(); // => 3
			System.out.println(months);
			// 日数を取得
			int days = period.getDays(); // => 8
			System.out.println(days);
		}
		/////////////////////////////////////////////////////////////////////////////
		// TimeAPIで2つの日付の間隔を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			// 2013年12月8日を表わすLocalDateインスタンスを生成
			LocalDate date = LocalDate.of(2013, 12, 8);
			System.out.println(date);
			// 1年6 ヶ月を表わすPeriodを生成
			Period period = Period.of(1, 6, 0);
			System.out.println(period);
			// LocalDateにPeriodを加算
			LocalDate result = date.plus(period); // => 2015-06-08
			System.out.println(result);
		}

	}

}
