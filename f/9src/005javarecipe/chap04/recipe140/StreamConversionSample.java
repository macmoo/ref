package jp.co.shoeisha.javarecipe.chapter04.recipe140;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConversionSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Streamをコレクションに変換する
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
			
			// Streamに対する処理を行ない、結果をListに変換
			List<String> result1 = list.stream().map(s -> s.toUpperCase())
					.collect(Collectors.toList());
			System.out.println(result1);
			
			// Streamに対する処理を行ない、結果をSetに変換
			Set<String> result2 = list.stream().map(s -> s.toUpperCase())
					.collect(Collectors.toSet());
			System.out.println(result2);
			
			// Collectors#toCollection()メソッドを使用すると変換後の実装クラスを指定することも可能
			List<String> result3 = list.stream().map(s -> s.toUpperCase())
					.collect(Collectors.toCollection(LinkedList::new));
			System.out.println(result3);
			
			// 文字列をキーに、その文字列の長さを格納したMapに変換
			Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(
					s -> s,         // Mapのキーを取得するラムダ式
					s -> s.length() // Mapの値を取得するラムダ式
				));
			System.out.println(map);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Streamを配列に変換する
		/////////////////////////////////////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
			
			// Streamに対する処理を行ない、結果を配列に変換
			Object[] result1 = list.stream().map(s -> s.toUpperCase())
					.toArray();
			System.out.println(Arrays.toString(result1));
			
			// toArray ( )メソッドに配列のコンストラクタを指定するとその型の配列に変換可能
			String[] result2 = list.stream().map(s -> s.toUpperCase())
					.toArray(String[]::new);
			System.out.println(Arrays.toString(result2));
		}
	}
	
}
