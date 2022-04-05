package jp.co.shoeisha.javarecipe.chapter05.recipe160;

import java.time.LocalDateTime;
import java.time.Month;

public class TimeAPIBeforeAfterSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// isEqual()/isBefore()/isAfter()で前後関係を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			LocalDateTime localDateTime1 = LocalDateTime.now();
			LocalDateTime localDateTime2 = LocalDateTime.of(2014, Month.MARCH, 12, 12, 5);
			if (localDateTime1.isEqual(localDateTime2)) {
				// localDateTime1とlocalDateTime2が同じ場合
				System.out.println("localDataTime1とlocalDateTime2は同じ");
			} else if (localDateTime1.isBefore(localDateTime2)) {
				// localDateTime1がlocalDateTime2より前の場合
				System.out.println("localDataTime1はlocalDateTime2より前");
			} else if (localDateTime1.isAfter(localDateTime2)) {
				// localDateTime1がlocalDateTime2より後の場合
				System.out.println("localDataTime1はlocalDateTime2より後");
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// conpareTo()で前後関係を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			LocalDateTime localDateTime1 = LocalDateTime.now();
			LocalDateTime localDateTime2 = LocalDateTime.of(2014, Month.MARCH, 12, 12, 5);
			// 0の場合は一致、負の数の場合はlocalDateTime1がlocalDateTime2より前、正の数の場合はlocalDateTime1がlocalDateTime2より後
			int result = localDateTime1.compareTo(localDateTime2);
			System.out.println(result);
		}

	}
}
