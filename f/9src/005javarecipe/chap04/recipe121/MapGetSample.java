package jp.co.shoeisha.javarecipe.chapter04.recipe121;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapGetSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// 指定されたキーに関連付けられた値を取得
		System.out.println(map.get("A"));	// => 1
		System.out.println(map.get("B"));	// => 2
		System.out.println(map.get("C"));	// => 3

		// Mapに含まれたすべての値を取得
		Collection<String> collection = map.values();
		for (String value : collection) {
			System.out.println(value);	// => 1 2 3
		}
	}

}
