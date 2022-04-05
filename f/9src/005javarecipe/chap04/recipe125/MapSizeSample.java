package jp.co.shoeisha.javarecipe.chapter04.recipe125;

import java.util.HashMap;
import java.util.Map;

public class MapSizeSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// Mapの要素数を調べる
		System.out.println(map.size());     // => 3

		// Mapが空かどうかを調べる
		System.out.println(map.isEmpty());  // => false
	}

}
