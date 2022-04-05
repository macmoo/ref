package jp.co.shoeisha.javarecipe.chapter04.recipe123;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetForJava8Sample {

	// Mapのすべて要素を取得する
	// JDK8以降のみ動作
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");

		// Mapに格納されたすべての要素を取得
		Set<Map.Entry<String, String>> set = map.entrySet();
		System.out.println(set);

		// ラムダ式でキーと値を繰り返し処理（Java 8以降）
		map.forEach((key, value) -> System.out.println(key + ", " + value));	// => A,1 B,2 C,3 D,4
    }

}
