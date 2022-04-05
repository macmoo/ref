package jp.co.shoeisha.javarecipe.chapter04.recipe133;

import java.util.Arrays;
import java.util.List;

public class StreamFilterSample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		list.stream()
			.filter(s -> s.startsWith("J")) // "J"で始まる要素のみ
			.forEach(System.out::println);  // "Java"、"JavaScript"の順に表示
	}
	
}
