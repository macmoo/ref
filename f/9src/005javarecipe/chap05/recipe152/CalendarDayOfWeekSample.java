package jp.co.shoeisha.javarecipe.chapter05.recipe152;

import java.util.Calendar;

public class CalendarDayOfWeekSample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// Calendar.DAY_OF_WEEKが曜日を示す
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			// 月曜日の場合
			System.out.println("月曜日");
		case Calendar.TUESDAY:
			// 火曜日の場合
			System.out.println("火曜日");
		case Calendar.WEDNESDAY:
			// 水曜日の場合
			System.out.println("水曜日");
		case Calendar.THURSDAY:
			// 木曜日の場合
			System.out.println("木曜日");
		case Calendar.FRIDAY:
			// 金曜日の場合
			System.out.println("金曜日");
		case Calendar.SATURDAY:
			// 土曜日の場合
			System.out.println("土曜日");
		case Calendar.SUNDAY:
			// 日曜日の場合
			System.out.println("日曜日");
		default:
			// それ以外の場合（あり得ない）
		}
	}

}
