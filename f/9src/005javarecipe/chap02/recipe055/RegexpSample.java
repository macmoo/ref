package jp.co.shoeisha.javarecipe.chapter02.recipe055;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 正規表現の使い方
		/////////////////////////////////////////////////////////////////////////////
		{
			// [meny]が含まれているか調べる正規表現
			Pattern pattern = Pattern.compile(".*many.*");
			// Matcherオブジェクトを取得
			Matcher matcher = pattern.matcher("Java Recipe has many Recipes!!");
			// 文字列が正規表現に一致するかどうかを取得
			boolean result = matcher.matches(); //=> true
			System.out.println(result);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 正規表現のエスケープ
		/////////////////////////////////////////////////////////////////////////////
		{
			// 行頭が[INFO]で始まっているかどうかを調べる正規表現
			// \を\でエスケープ
			Pattern pattern = Pattern.compile("^\\[INFO\\]");
			Matcher matcher = pattern.matcher("[INFO]info message");
			boolean result = matcher.find(); // => true
			System.out.println(result);
		}
		{
			// \Qと\Eで囲むとまとめてエスケープできる
			Pattern pattern = Pattern.compile("^\\Q[INFO]\\E");
			Matcher matcher = pattern.matcher("[INFO]info message");
			boolean result = matcher.find(); // => true
			System.out.println(result);
		}
	}

}
