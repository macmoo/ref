package jp.co.shoeisha.javarecipe.chapter02.recipe057;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpReplaceSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 正規表現で文字列を検索する。
		/////////////////////////////////////////////////////////////////////////////
		{
			// 置換後の文字列
			String replaceString = "レシピ ";
			// Patternをコンパイル
			Pattern pattern = Pattern.compile("Recipe.");
			// 検索結果をMatcherに格納
			Matcher matcher = pattern.matcher("Java Recipe has many Recipes!!");
			// 最初にヒットした文字列だけを置換
			String result1 = matcher.replaceFirst(replaceString);
			System.out.println(result1); // => "Java レシピ has many Recipes!!"
			// 移動したmatcherのシーケンスをリセット matcher.reset ( );
			// ヒットした文字列すべてを置換
			String result2 = matcher.replaceAll(replaceString);
			System.out.println(result2); // => "Java レシピ has many レシピ !!"
			// 移動したmatcherのシーケンスをリセット
			matcher.reset();
			// ヒットするごとに処理を実施
			StringBuffer replacedString = new StringBuffer();
			while (matcher.find()) {
				// ヒットした対象を置換
				matcher.appendReplacement(replacedString, replaceString);
			}
			// 検索に最後にヒットした部分以降の検索対象文字列を結合
			StringBuffer result3 = matcher.appendTail(replacedString);
			System.out.println(result3); // => "Java レシピ has many レシピ !!"
		}
		/////////////////////////////////////////////////////////////////////////////
		// Stringクラスだけで正規表現を使う。
		/////////////////////////////////////////////////////////////////////////////
		{
			String target = "Java Recipe has many Recipes!!";
			// replaceAll()メソッドですべて置換
			String result = target.replaceAll("Recipe.", "レシピ ");
			System.out.println(result); // => "Java レシピ has many レシピ !!"
			// replaceFirst()メソッドで最初にヒットしたときだけ置換
			String result2 = target.replaceFirst("Recipe.", "レシピ ");
			System.out.println(result2); // => "Java レシピ has many Recipes!!"
			// $0を指定するとヒットしたもの全体を置換
			String result3 = target.replaceAll("Recipe", "$0 is Great ");
			System.out.println(result3); // => Java Recipe is Great has many Recipe is Great s!!
		}
	}

}
