package jp.co.shoeisha.javarecipe.chapter04.recipe139;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingSample {
	
	public static void main(String[] args) {
		// Streamの要素をグループ化する
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		// 先頭の一文字が同一の要素をグルーピング
		Map<Character, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		// 先頭が'J'で始まるものを表示
		System.out.println(map.get('J')); // => [Java, JavaScript]
		// 先頭が'G'で始まるものを表示
		System.out.println(map.get('G')); // => [Groovy]
		// 先頭が'S'で始まるものを表示
		System.out.println(map.get('S')); // => [Scala]
	}
	
}
