package jp.co.shoeisha.javarecipe.chapter02.recipe052;

import java.util.Date;

public class StringFormatSample {

	public static void main(String[] args) {
		String str = "String";
		boolean b = true;
		int i = 127;
		Date now = new Date();
		// 文字列を埋め込み
		String result1 = String.format("文字列の書式: %s", str); // => "文字列の書式: String"
		System.out.println(result1);
		// 真偽値を埋め込み
		String result2 = String.format("booleanの書式大文字: %B", b); // => "booleanの書式大文字: TRUE"
		System.out.println(result2);
		// 整数を埋め込み、4つ目は5桁で0を埋める。
		String result3 = String.format("整数の書式: %d %o %x %05d", i, i, i, i); // => "整数の書式: 127 177 7f 00127"
		System.out.println(result3);
		// 浮動小数を埋め込み、%1$などで絶対引数インデックスを指定
		String result4 = String.format("浮動小数点の書式: %4$e %3$f %2$g %1$a", 127.01, 127.02, 127.03, 127.04);
		// => "浮動小数点の書式: 1.270400e+02 127.030000 127.020 0x1.fc0a3d70a3d71p6"
		System.out.println(result4);
		// 日付を埋め込み、%<で相対インデックスを指定して直前の引数と同じものを利用
		String result5 = String.format("日時の書式: %tY年 %<tB %<td日 %<tk時 %<tM分 %<tS秒", now);
		// => "日時の書式: 2013年 8月 04日 15時 30分 18秒"
		System.out.println(result5);
	}
}
