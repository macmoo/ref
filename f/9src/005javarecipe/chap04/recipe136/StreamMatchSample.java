package jp.co.shoeisha.javarecipe.chapter04.recipe136;

import java.util.Arrays;
import java.util.List;

public class StreamMatchSample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		// すべての要素が"J"で始まるかどうか
		boolean result1 = list.stream ( ).allMatch(s -> s.startsWith("J")); // => false
		System.out.println(result1);
		
		// "J"で始まるか要素があるかどうか
		boolean result2 = list.stream ( ).anyMatch(s -> s.startsWith("J")); // => true
		System.out.println(result2);
		
		// "J"で始まる要素がないかどうか
		boolean result3 = list.stream ( ).noneMatch(s -> s.startsWith("J")); // => false
		System.out.println(result3);
	}
	
}
