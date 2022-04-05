package jp.co.shoeisha.javarecipe.chapter05.recipe149;

import java.util.Calendar;
import java.util.Date;

public class CalendarAddSample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// 現在時刻が返却される
		Date date1 = calendar.getTime();
		System.out.println(date1);
		// 現在日時に45日を足す
		calendar.add(Calendar.DATE, 45);
		// 現在日時に45日を足された日付が返却される
		Date date2 = calendar.getTime();
		System.out.println(date2);
		// 現在日時に45日足されて、1 ヶ月引かれた値を計算する
		calendar.add(Calendar.MONTH, -1);
		// 現在日時に45日足されて、1 ヶ月引かれた値が返却される
		Date date3 = calendar.getTime();
		System.out.println(date3);
	}

}
