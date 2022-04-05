package jp.co.shoeisha.javarecipe.chapter04.recipe138;

import java.util.Arrays;
import java.util.List;

public class StreamSortSample {

	public static void main(String[] args) {
		// Streamの要素をソートする
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		list.stream()
			.sorted() // 要素の自然順序付けでソート
			.forEach(System.out::println); // => "Groovy"、"Java"、"JavaScript"、"Scala"の順で表示
		
		list.stream ( )
			.sorted((a, b) -> a.length() - b.length()) // 文字列の長さでソート
			.forEach(System.out::println); // => "Java"、"Scala"、"Groovy"、"JavaScript"の順で表示		
	}
	
}
