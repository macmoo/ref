package jp.co.shoeisha.javarecipe.chapter02.recipe042;

import java.util.Arrays;
import java.util.List;

public class StringAppendSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// +演算子を使った文字列の連結
		/////////////////////////////////////////////////////////////////////////////
		{
			// String"Hello "と"World!"を連結して、"Hello World!"を生成
			String str = "Hello " + "World!";
			System.out.println(str);
		}
		/////////////////////////////////////////////////////////////////////////////
		// StrinbBuilderを使った連結
		/////////////////////////////////////////////////////////////////////////////
		{
			// String"Hello "と"World!"をappend()メソッドで連結して、StringBuilder"Hello World!"を生成
			StringBuilder sb = new StringBuilder();
			sb.append("Hello ");
			sb.append("World!");
			// StringBuilder#toString()メソッドでStringを返す
			String str = sb.toString();
			System.out.println(str);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Strinb#join()メソッドを使った連結(Java 8以降)
		/////////////////////////////////////////////////////////////////////////////
		{
			// 可変長引数で指定した文字列を連結
			String str1 = String.join("-", "Java", "Recipe", "is", "Great"); // -> Java-Recipe-is-Great
			System.out.println(str1);
			// Listに格納された文字列を連結
			List<String> list = Arrays.asList("Java", "8", "is", "great!");
			String str2 = String.join(" ", list); // -> Java 8 is great!
			System.out.println(str2);
		}
	}

}
