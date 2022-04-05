package jp.co.shoeisha.javarecipe.chapter05.recipe151;

import java.util.Calendar;

public class CalendarGetActualMaxSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// getActualMaximumで月の最終日を取得
		/////////////////////////////////////////////////////////////////////////////
		Calendar calendar = Calendar.getInstance();
		// 2014/02をセット
		calendar.set(2014, Calendar.FEBRUARY, 1);
		int day1 = calendar.getActualMaximum(Calendar.DATE); // => 28
		System.out.println(day1);
		// 2014/09をセット
		calendar.set(2014, Calendar.SEPTEMBER, 1);
		int day2 = calendar.getActualMaximum(Calendar.DATE); // => 30
		System.out.println(day2);
		// 2016/02をセット（うるう年）
		calendar.set(2016, Calendar.FEBRUARY, 1);
		int day3 = calendar.getActualMaximum(Calendar.DATE); // => 29
		System.out.println(day3);
	}

}
