package jp.co.shoeisha.javarecipe.chapter05.recipe147;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatSample {

	public static void main(String[] args) {
		// フォーマットルールとLocaleを指定したSimpleDateFormatクラスの生成
		SimpleDateFormat jpSdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日' E, a KK':'mm,z");
		SimpleDateFormat ukSdf = new SimpleDateFormat("yyyy'/'MM'/'dd'/' EEE, a KK':'mm", Locale.US);
		// 現在の時刻を文字列にフォーマット
		String str1 = jpSdf.format(new Date()); // => "2013年08月11日 日, 午前 10:52,JST"
		System.out.println(str1);
		String str2 = ukSdf.format(new Date()); // => "2013/08/11/ Sun, AM 10:52"
		System.out.println(str2);
	}
}
