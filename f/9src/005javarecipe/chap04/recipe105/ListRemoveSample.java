package jp.co.shoeisha.javarecipe.chapter04.recipe105;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveSample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("X");
		list1.add("D");
		list1.add("Y");
		list1.add("E");
		System.out.println(list1);	// => [A, B, C, X, D, Y, E]

		// 削除対象の要素を格納
		List<String> list2 = new ArrayList<>();
		list2.add("X");
		list2.add("Y");

		// 削除しない対象の要素を格納
		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("E");

		// 指定したインデックスの要素を削除し、削除した要素を返す
		System.out.println(list1.remove(2));         // => C
		System.out.println(list1);                   // => [A, B, X, D, Y, E]

		// 指定した要素を削除し、削除する要素がなかった場合はfalseを返す
		System.out.println(list1.remove("D"));       // => true
		System.out.println(list1);                   // => [A, B, X, Y, E]

		// 指定したコレクションのすべての要素を削除し、Listが変更されたらtrueを返す
		System.out.println(list1.removeAll(list2));  // => true
		System.out.println(list1);                   // => [A, B, E]

		// 指定したコレクション以外のすべての要素を削除し、Listが変更されたらtrueを返す
		System.out.println(list1.retainAll(list3));  // => true
		System.out.println(list1);                   // => [A, E]

		// すべての要素を削除
		list1.clear();
		System.out.println(list1.size());            // => 0
		System.out.println(list1.isEmpty());         // => true
	}

}
