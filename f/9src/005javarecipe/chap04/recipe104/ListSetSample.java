package jp.co.shoeisha.javarecipe.chapter04.recipe104;

import java.util.ArrayList;
import java.util.List;

public class ListSetSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);	// => [A, B, C]

		// インデックス1の要素を"X"に変更
		list.set(1, "X");	// => B
		System.out.println(list);	// => [A, X, C]
	}

}
