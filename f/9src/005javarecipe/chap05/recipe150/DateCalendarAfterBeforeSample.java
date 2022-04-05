package jp.co.shoeisha.javarecipe.chapter05.recipe150;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarAfterBeforeSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Dateの前後関係を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			// 現在日時を生成
			Calendar calendar = Calendar.getInstance();
			Date date1 = calendar.getTime();
			// 現在日時より30分後を生成
			calendar.add(Calendar.MINUTE, 30);
			Date date2 = calendar.getTime();
			if (date1.before(date2)) {
				// date1がdate2よりも前の場合
				System.out.println("date1はdate2より前");
			} else {
				// date1がdate2と同じか後の場合
				System.out.println("date1はdate2より後");
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// Calendarの前後関係を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			Calendar calendar1 = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
			// calendar2に過去日付をセット
			calendar2.set(1920, 6, 20, 19, 00);
			if (calendar1.before(calendar2)) {
				// calendar1の日付がcalendar2よりも前の場合
				System.out.println("calendar1はcalendar2より前");
			} else {
				// calendar1の日付がcalendar2と同じか後の場合
				System.out.println("calendar1はcalendar2より後");
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// Dateの大小比較
		/////////////////////////////////////////////////////////////////////////////
		{
			// 現在日時を生成
			Calendar calendar = Calendar.getInstance();
			Date date1 = calendar.getTime();
			// 現在日時より30分後を生成
			calendar.add(Calendar.MINUTE, 30);
			Date date2 = calendar.getTime();
			// 0の場合は一致、負の数の場合はdate1がdate2より前、正の数の場合はdate1がdate2より後
			int result = date1.compareTo(date2);
			System.out.println(result);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Calendarの大小比較
		/////////////////////////////////////////////////////////////////////////////
		{
			Calendar calendar1 = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
			// calendar2に過去日付をセット
			calendar2.set(1920, 6, 20, 19, 00);
			// 0の場合は一致、負の数の場合はdate1がdate2より前、正の数の場合はdate1がdate2より後
			int result = calendar1.compareTo(calendar2);
			System.out.println(result);
		}

	}

}
