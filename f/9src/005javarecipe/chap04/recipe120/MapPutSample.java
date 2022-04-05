package jp.co.shoeisha.javarecipe.chapter04.recipe120;

import java.util.HashMap;
import java.util.Map;

public class MapPutSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// すでにキーが登録されている場合、上書きされる
		map.put("A", "5");
		System.out.println(map);	// => {A=5, B=2, C=3}
	}

}
