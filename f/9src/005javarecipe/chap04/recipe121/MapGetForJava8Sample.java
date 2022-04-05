package jp.co.shoeisha.javarecipe.chapter04.recipe121;

import java.util.HashMap;
import java.util.Map;

public class MapGetForJava8Sample {

	// キーが存在しない場合の値を指定する
	// JDK8以降のみ動作
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");

		// 存在するキーを指定して値を取得
		System.out.println(map.getOrDefault("A", "-")); // => 1

		// 存在しないキーを取得して値を取得
		System.out.println(map.getOrDefault("B", "-")); // => -
	}
  
}
