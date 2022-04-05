package jp.co.shoeisha.javarecipe.chapter04.recipe137;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSumSample {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Streamの合計値を求める
		/////////////////////////////////////////////////////////////////////////////
		{
			IntStream stream = IntStream.of(1, 2, 3, 4 ,5);
			int total = stream.sum(); // => 15
			System.out.println(total);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Streamの要素を集計する
		/////////////////////////////////////////////////////////////////////////////
		{
			Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
			
			// ((((1 * 2) * 3) * 4) * 5)という計算が行なわれる
			Optional<Integer> result = stream.reduce((a, b) -> a * b);
			
			// 値を表示（Streamが空の場合は-1）
			System.out.println(result.orElse(-1));
		}
		/////////////////////////////////////////////////////////////////////////////
		// Stream#reduce()メソッドに初期値を与える
		/////////////////////////////////////////////////////////////////////////////
		{
			Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
			
			// (((((1 * 1) * 2) * 3) * 4) * 5)という計算が行なわれる
			Integer result = stream.reduce(1, (a, b) -> a * b);
			
			// 値を表示
			System.out.println(result); // => 120
		}
	}
	
}
