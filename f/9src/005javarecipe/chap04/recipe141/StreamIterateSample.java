package jp.co.shoeisha.javarecipe.chapter04.recipe141;

import java.util.stream.Stream;

public class StreamIterateSample {

	public static void main(String[] args) {
		// 10、20、40、80...と無限に値を返すStreamを生成
		Stream<Integer> stream = Stream.iterate(10, i -> i * 2);
		
		// 先頭の5件のみ表示
		stream.limit(5).forEach(System.out::println); // => 10、20、40、80、160の順に表示
	}
	
}
