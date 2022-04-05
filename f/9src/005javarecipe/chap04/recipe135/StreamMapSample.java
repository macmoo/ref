package jp.co.shoeisha.javarecipe.chapter04.recipe135;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Streamの要素を変換する
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
			
			list.stream()
				.map(s -> s.length())          // 文字列の長さに変換
				.forEach(System.out::println); // 4、5、10、6の順に表示
		}
		/////////////////////////////////////////////////////////////////////////////
		// flatMap()メソッドを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java,Groovy", "C#,VB.NET");
			
			list.stream()
				.flatMap(s -> Stream.of(s.split(","))) // カンマで分割したStreamを返す
				.forEach(System.out::println);         // "Java"、"Groovy"、"C#"、"VB.NET"の順で表示
		}
	}
	
}
