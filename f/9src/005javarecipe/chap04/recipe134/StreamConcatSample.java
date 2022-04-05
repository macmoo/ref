package jp.co.shoeisha.javarecipe.chapter04.recipe134;

import java.util.stream.Stream;

public class StreamConcatSample {
	
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("Java", "Groovy");
		Stream<String> s2 = Stream.of("Scala", "Clojure");
		
		// 2つのStreamを連結する
		Stream<String> s3 = Stream.concat(s1, s2);
		
		// 連結したStreamの内容を表示
		s3.forEach(System.out::println); // => "Java"、"Groovy"、"Scala"、"Clojure"の順に表示
	}
	
}
