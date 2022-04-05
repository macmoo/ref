package jp.co.shoeisha.javarecipe.chapter02.recipe043;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringLengthSample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/////////////////////////////////////////////////////////////////////////////
		// Stringの文字列の長さを調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			String str = "こんにちわ世界";
			// 文字列の長さを取得
			int strlength = str.length(); // => 7
			System.out.println(strlength);

		}
		/////////////////////////////////////////////////////////////////////////////
		// サロゲートペアを含む文字列の長さを調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			String str = "𠀋";

			// length()メソッドで文字数を取得
			int len1 = str.length(); // => 2
			System.out.println(len1);
			// codePointCount()メソッドで文字数を取得
			int len2 = str.codePointCount(0, str.length()); // => 1
			System.out.println(len2);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Stringのバイト長を調べる
		/////////////////////////////////////////////////////////////////////////////
		{
			String str = "こんにちわ世界";

			// 文字列のバイト長を取得する(Windows-31Jの場合)
			int sjisLength = str.getBytes(Charset.forName("Windows-31J")).length;// => 14
			System.out.println(sjisLength);
			// 文字列のバイト長を取得する(UTF-8の場合)
			int utf8Length = str.getBytes(StandardCharsets.UTF_8).length; // => 21
			System.out.println(utf8Length);
		}

	}

}
