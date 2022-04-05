package jp.co.shoeisha.javarecipe.chapter02.recipe056;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpSearchSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 正規表現で文字列を検索する。
		/////////////////////////////////////////////////////////////////////////////
		{
			Pattern pattern = Pattern.compile("Recipe.");
			// "Java Recipe has many Recipes!!"を検索
			Matcher matcher = pattern.matcher("Java Recipe has many Recipes!!");
			// 正規表現にヒットした単語の取り出し
			// find()メソッドがfalseを返却するまでループ
			while (matcher.find()) {
				// group()メソッドを呼び出して、正規表現にヒットした文字列を取り出す
				String group = matcher.group();
				System.out.println(group); // => 一度目は"Recipe ", 二度目は"Recipes"
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// マッチした文字列の一部を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// 2つのグループを含む正規表現
			Pattern pattern = Pattern.compile("(.*):(.*)");
			// "Java Recipe : many Recipes!!"を検索
			Matcher matcher = pattern.matcher("Java Recipe : many Recipes!!");
			// 正規表現にヒットした単語の取り出し
			if (matcher.find()) {
				// group()メソッドに0を渡すと全体を取得
				System.out.println(matcher.group(0)); // => "Java Recipe : many Recipes!!"
				// 1つ目のグループにマッチした部分を取得
				System.out.println(matcher.group(1)); // => "Java Recipe "
				// 2つ目のグループにマッチした部分を取得
				System.out.println(matcher.group(2)); // => " many Recipes!!"
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// MULTILINEオプションを指定したときの行頭行末、全体の先頭、末尾の違い
		/////////////////////////////////////////////////////////////////////////////
		{
			// 正規表現
			Pattern pattern2 = Pattern.compile("^many.*");
			// Matcherオブジェクトを取得、対象文字列は改行あり
			Matcher matcher2 = pattern2.matcher("Java Recipe has \nmany Recipes!!");
			System.out.println(matcher2.find()); // -> false
			// 正規表現
			Pattern pattern = Pattern.compile("^many.*", Pattern.MULTILINE);
			// Matcherオブジェクトを取得、対象文字列は改行あり
			Matcher matcher = pattern.matcher("Java Recipe has \nmany Recipes!!");
			System.out.println(matcher.find()); // -> true
		}

	}

}
