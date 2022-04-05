package jp.co.shoeisha.javarecipe.chapter04.recipe130;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLengthSample {
	
	public static void main(String[] args) {
		// 要素数が有限のStreamの場合
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		Stream<String> stream1 = list.stream();
		long count1 = stream1.count(); // => 4
		System.out.println(count1);
		
		// 要素数が無限のStreamの場合
		IntStream stream2 = IntStream.iterate(0, i -> i + 1);
		long count2 = stream2.count(); // => 無限ループになってしまう
		System.out.println(count2);
	}
	
}
