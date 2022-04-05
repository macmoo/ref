package jp.co.shoeisha.javarecipe.chapter04.recipe142;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamSample {
	public static void main(String[] args) {
		// Listから並列処理可能なStreamを取得する
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		list.parallelStream()              // 並列処理可能なStreamを取得
			.map(s -> s.toUpperCase())     // 大文字に変換
			.forEach(System.out::println); // 標準出力に表示

		// Streamから並列処理可能なStreamを取得する
		IntStream.range(1, 100)
			.parallel()                    // 並列処理可能なStreamを取得
			.filter(i -> i % 2 == 0)       // 偶数のみ抽出
			.forEach(System.out::println); // 標準出力に表示
	}
}
