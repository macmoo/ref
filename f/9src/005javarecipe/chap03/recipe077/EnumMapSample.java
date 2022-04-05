package jp.co.shoeisha.javarecipe.chapter03.recipe077;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapSample {

	public static void main(String[] args) {

		// 生成時に列挙型のClassインスタンスを渡す
		EnumMap<Sex, Integer> map = new EnumMap<>(Sex.class);

		map.put(Sex.WOMAN, 1);
		map.put(Sex.MAN, 2);

		// キーと値を取得
		for(Entry<Sex, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
				// => MAN:2
				// => WOMAN:1
		}

		// キーのみ取得
		for(Sex sex : map.keySet()) {
			System.out.println(sex);
				// => MAN
				// => WOMAN
		}

		// 値のみ取得
		for(int i : map.values()) {
			System.out.println(i);
				// => 2
				// => 1
		}
	}

	enum Sex {MAN, WOMAN}

}
