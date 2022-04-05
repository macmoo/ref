package jp.co.shoeisha.javarecipe.chapter04.recipe122;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");

		// Map#keySet ( )メソッドを利用したキーセットの取得
		Set<String> keyset = map.keySet();
		System.out.println(keyset);		// => [D, A, B, C]
	}

}
