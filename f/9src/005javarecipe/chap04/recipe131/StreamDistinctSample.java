package jp.co.shoeisha.javarecipe.chapter04.recipe131;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctSample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "Java", "Groovy");
		
		// 重複した要素を排除して件数を取得
		long count = list.stream().distinct().count(); // => 3
		System.out.println(count);
	}

}
