package jp.co.shoeisha.javarecipe.chapter04.recipe129;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamSample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// IntStreamを生成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 固定の要素からIntStreamを生成する
			IntStream intStream1 = IntStream.of(1, 2, 3);
			
			// 配列からIntStreamを生成する
			int [ ] array = {1, 2, 3};
			IntStream intStream2 = IntStream.of(array);
			
			// 1から9までの値を返すIntStreamを生成する
			IntStream intStream3 = IntStream.range(1, 10);
			
			// 1から10までの値を返すIntStreamを生成する
			IntStream intStream4 = IntStream.rangeClosed(1, 10);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 通常のStreamをIntStreamに変換する
		/////////////////////////////////////////////////////////////////////////////
		{
			Stream<String> stream = Stream.of("Java", "Scala", "JavaScript", "Groovy");
			
			// Stream#mapToInt ( )メソッドでIntStreamに変換
			IntStream intStream = stream.mapToInt(s -> s.length ( ));
			
			// IntStreamの各要素を標準出力に出力する
			intStream.forEach(System.out::println); // => 4、5、10、6の順に表示
		}
	}
	
}
