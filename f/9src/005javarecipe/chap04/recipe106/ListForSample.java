package jp.co.shoeisha.javarecipe.chapter04.recipe106;

import java.util.ArrayList;
import java.util.List;

public class ListForSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		// 拡張for文を使用する場合
		for (String value : list) {
			System.out.println("(" + value + ")");	// => (A) (B) (C)
		}
	}

}
