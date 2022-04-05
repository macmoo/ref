package jp.co.shoeisha.javarecipe.chapter04.recipe123;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");

		// Mapに格納されたすべての要素を取得
		Set<Map.Entry<String, String>> set = map.entrySet();

		// 各要素のキーと値を取得
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ", " + entry.getValue());	// => A,1 B,2 C,3 D,4
		}
	}

}
