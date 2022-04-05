package jp.co.shoeisha.javarecipe.chapter02.recipe037;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Listをソートする（匿名クラス）
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "Groovy");
			list.sort(new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					return s1.length() - s2.length();
				}
			});
			
			System.out.println(list);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Listをソートする（ラムダ式）
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "Groovy");
			list.sort((String s1, String s2) -> s1.length ( ) - s2.length ( ));
			
			System.out.println(list);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// コレクションの要素を標準出力に出力する
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "Groovy");
			
			// Java 7以前の場合
			for (String s : list) {
				System.out.println(s);
			}
			
			// Java 8の場合
			list.forEach(s -> System.out.println(s));
		}
	}

}
