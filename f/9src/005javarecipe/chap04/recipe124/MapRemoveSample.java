package jp.co.shoeisha.javarecipe.chapter04.recipe124;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");

		// Mapから要素を削除する（戻り値は削除した値）
		String removed = map.remove("C");
		System.out.println(removed); // => 3
		System.out.println(map);     // => {A=1, B=2}

		// Mapの全要素を削除する
		map.clear();
		System.out.println(map);     // => {}  要素なし
	}

}
