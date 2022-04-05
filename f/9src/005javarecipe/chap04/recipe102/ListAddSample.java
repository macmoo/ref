package jp.co.shoeisha.javarecipe.chapter04.recipe102;

import java.util.ArrayList;
import java.util.List;

public class ListAddSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// Listの末尾に要素を追加
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);	// => [A, B, C]

		// [A, B, C]のインデックス2番目に要素を挿入
		list.add(2, "Z");
		System.out.println(list);	// => [A, B, Z, C]

		// Listの先頭に要素を追加
		list.add(0, "X");
		System.out.println(list);	// => [X, A, B, Z, C]
	}

}
