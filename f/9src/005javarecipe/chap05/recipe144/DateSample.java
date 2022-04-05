package jp.co.shoeisha.javarecipe.chapter05.recipe144;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 現在日時を取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 実行した瞬間の日時が生成される（実行結果は毎回異なる）
			Date date1 = new Date();
			System.out.println(date1);

			// 現在日時を表わすカレンダからDateインスタンスを生成
			Calendar calendar = Calendar.getInstance();
			Date date2 = calendar.getTime();
			System.out.println(date2);
		}

		/////////////////////////////////////////////////////////////////////////////
		// タイムゾーンを指定して現在日時を取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			// デフォルトのタイムゾーン、ロケール情報を持ったカレンダクラスの生成
			Calendar calendar1 = Calendar.getInstance();
			System.out.println(calendar1);
			// ロケールがUSのカレンダの生成
			Calendar calendar2 = Calendar.getInstance(Locale.US);
			System.out.println(calendar2);
			// タイムゾーンがアメリカ西海岸のカレンダの生成
			TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
			Calendar calendar3 = Calendar.getInstance(timezone);
			System.out.println(calendar3.getTimeZone());
		}
	}

}
