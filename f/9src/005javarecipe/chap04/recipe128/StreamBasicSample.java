package jp.co.shoeisha.javarecipe.chapter04.recipe128;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasicSample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Streamの取得
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
			Stream<String> s1 = list.stream();
			
			// SetからStreamを取得
			Set<String> set = new HashSet<>();
			Stream<String> s2 = set.stream();
			
			// Mapの場合はentrySet()メソッドなどからStreamを取得
			Map<String, String> map = new HashMap<>();
			Stream<Map.Entry<String, String>> s3 = map.entrySet().stream();
		}
		/////////////////////////////////////////////////////////////////////////////
		// Stream#of()メソッドでStreamを生成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 配列からStreamを生成
			String [ ] array = {"Java", "Scala", "JavaScript", "Groovy"};
			Stream<String> s1 = Stream.of(array);
			
			// 固定の要素からStreamを生成
			Stream<String> s2 = Stream.of("Java", "Scala", "JavaScript", "Groovy");
		}
		/////////////////////////////////////////////////////////////////////////////
		// 配列からStreamを生成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 配列からStreamを生成
			String [ ] array1 = {"Java", "Scala", "JavaScript", "Groovy"};
			Stream<String> s1 = Arrays.stream(array1);
			
			// int型の配列はIntStreamになる
			int [ ] array2 = {1, 2, 3};
			IntStream s2 = Arrays.stream(array2);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Streamに対する処理
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
			list.stream()
				.filter(s -> s.startsWith("J"))            // 先頭がJで始まっているもののみ
				.map(s -> s.toUpperCase())                 // 各要素を大文字に変換
				.sorted((a, b) -> a.length() - b.length()) // 文字数の少ない順にソート
				.forEach(System.out::println);             // 標準出力に出力
		}
		/////////////////////////////////////////////////////////////////////////////
		// 終端メソッド呼び出し後のStreamは再利用できない
		/////////////////////////////////////////////////////////////////////////////
		{
			Stream<String> stream = Stream.of("Java", "Scala", "JavaScript", "Groovy");
			
			// Streamの要素を標準出力に出力
			stream.forEach(System.out::println);
			
			// もう一度呼び出すとIllegalStateExceptionがスローされる
			try {
				stream.forEach(System.out::println);
			} catch(IllegalStateException ex){
				ex.printStackTrace();
			}
		}
	}
	
}
