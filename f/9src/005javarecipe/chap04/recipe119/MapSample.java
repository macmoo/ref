package jp.co.shoeisha.javarecipe.chapter04.recipe119;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Mapを生成する
		/////////////////////////////////////////////
		{
			// Java 6の場合
			Map<String, String> hashMap = new HashMap<String, String>();

			// Java 7以降の場合
			Map<String, String> hashMap1 = new HashMap<>();
		}
		/////////////////////////////////////////////
		// 要素数を指定してMapを生成する
		/////////////////////////////////////////////
		{
			// HashMapの生成時に100個分の領域を確保
			Map<String, String> hashMap = new HashMap<>(100);
		}
		/////////////////////////////////////////////
		// 順序性の確認
		/////////////////////////////////////////////
		{
			// HashMapの生成
			Map<String, String> hashMap = new HashMap<>();
			hashMap.put("A", "1");
			hashMap.put("C", "3");
			hashMap.put("E", "5");
			hashMap.put("D", "4");
			hashMap.put("B", "2");
			System.out.println(hashMap);       // => {D=4, E=5, A=1, B=2, C=3}　順序性なし

			// LinkedHashMapの生成
			Map<String, String> linkedHashMap = new LinkedHashMap<>();
			linkedHashMap.put("A", "1");
			linkedHashMap.put("C", "3");
			linkedHashMap.put("E", "5");
			linkedHashMap.put("D", "4");
			linkedHashMap.put("B", "2");
			System.out.println(linkedHashMap); // => {A=1, C=3, E=5, D=4, B=2}　格納順

			// TreeMapの生成
			Map<String, String> treeMap = new TreeMap<>();
			treeMap.put("A", "1");
			treeMap.put("C", "3");
			treeMap.put("E", "5");
			treeMap.put("D", "4");
			treeMap.put("B", "2");
			System.out.println(treeMap);      // => {A=1, B=2, C=3, D=4, E=5}　自然順序付け
		}
	}

}
