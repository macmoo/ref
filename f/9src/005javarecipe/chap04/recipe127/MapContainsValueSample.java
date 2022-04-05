package jp.co.shoeisha.javarecipe.chapter04.recipe127;

import java.util.HashMap;
import java.util.Map;

public class MapContainsValueSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// 指定した値が含まれるかどうかを調べる
		System.out.println(map.containsValue("A"));	// => false
		System.out.println(map.containsValue("1"));	// => true
	}

}
