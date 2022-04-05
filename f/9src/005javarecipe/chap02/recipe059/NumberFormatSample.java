package jp.co.shoeisha.javarecipe.chapter02.recipe059;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// NumberFormatで整形する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 整数値をフォーマット
			String result1 = NumberFormat.getIntegerInstance().format(1000000); // => "1,000,000"
			System.out.println(result1);
			// 通貨形式にフォーマット
			String result2 = NumberFormat.getCurrencyInstance().format(1000000); // => " ¥1,000,000"
			System.out.println(result2);
			// パーセント形式にフォーマット
			String result3 = NumberFormat.getPercentInstance().format(0.8); // => "80%"
			System.out.println(result3);
		}
		/////////////////////////////////////////////////////////////////////////////
		// ロケールを指定して整形する
		/////////////////////////////////////////////////////////////////////////////
		{
			// USロケールを指定
			Locale locale = Locale.US;
			String result = NumberFormat.getCurrencyInstance(locale).format(1000000); // => "$1,000,000"
			System.out.println(result);
		}
		/////////////////////////////////////////////////////////////////////////////
		// DecimalFormatで整形する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 6桁のゼロで埋めるフォーマット
			DecimalFormat zeroDF = new DecimalFormat("000,000");
			String result1 = zeroDF.format(1234); // => "001,234"
			System.out.println(result1);
			// 負の数に▲をつけてフォーマット
			DecimalFormat negativeDF = new DecimalFormat("###,###; ▲###,###");
			String result2 = negativeDF.format(-1234); // => "▲1,234"
			System.out.println(result2);
		}
	}

}
