package jp.co.shoeisha.javarecipe.chapter06.recipe202;

import java.util.Calendar;

public class ConsoleOutputSample {
	
	public static void main(String[] args) {
		// 改行なし
		System.out.print(1);
		System.out.print("文字列");
		
		// 改行あり
		System.out.println(1);
		System.out.println("文字列");
		
		// オブジェクトの場合はtoString ( )の結果を出力
		System.out.println(new java.util.Date ( )); // => "Tue Aug 13 14:23:59 JST 2013"
		
		// コンソールに書式付き文字列を出力する
		Calendar cal = Calendar.getInstance ( );
		int month = cal.get(Calendar.MONTH) + 1;
		int day   = cal.get(Calendar.DATE);
		
		System.out.printf("Today is %d/%d.", month, day);
	}
	
}
