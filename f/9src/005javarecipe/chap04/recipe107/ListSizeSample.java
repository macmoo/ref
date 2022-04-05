package jp.co.shoeisha.javarecipe.chapter04.recipe107;

import java.util.ArrayList;
import java.util.List;

public class ListSizeSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);	// => [A, B, C]

		// Listの要素数を調べる
		System.out.println(list.size());	// => 3

		// Listが空かどうかを調べる
		System.out.println(list.isEmpty());	// => false
	}

}
