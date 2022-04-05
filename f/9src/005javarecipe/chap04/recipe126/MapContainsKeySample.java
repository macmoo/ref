package jp.co.shoeisha.javarecipe.chapter04.recipe126;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeySample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// 指定したキーが含まれるかどうかを調べる
		System.out.println(map.containsKey("A"));	// => true
		System.out.println(map.containsKey("1"));	// => false
	}

}
