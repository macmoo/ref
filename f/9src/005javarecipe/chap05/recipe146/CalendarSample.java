package jp.co.shoeisha.javarecipe.chapter05.recipe146;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample {

	public static void main(String[] args) {
		// 生成段階では現在日時が入っている
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		// フィールドを指定して設定
		calendar.set(Calendar.YEAR, 1980);
		calendar.set(Calendar.HOUR_OF_DAY, 22);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		calendar.set(Calendar.MONTH, Calendar.JULY);
		// フィールドを指定して取得
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		// MONTHは0 〜11で返却されるため＋1
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);
		// カレンダの日付をDateインスタンスとして取得
		Date date = calendar.getTime();
		System.out.println(date);
	}

}
