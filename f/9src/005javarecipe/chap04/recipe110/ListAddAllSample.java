package jp.co.shoeisha.javarecipe.chapter04.recipe110;

import java.util.ArrayList;
import java.util.List;

public class ListAddAllSample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<String> list2 = new ArrayList<>();
		list2.add("X");
		list2.add("Y");

		// [A, B, C]の末尾に[X,Y]を追加
		list1.addAll(list2);

		System.out.println(list1);	// => [A, B, C, X, Y]

		// [A, B, C]のインデックス2番目に[X,Y]を追加
		list1.addAll(2, list2);
		System.out.println(list1);	// => [A, B, X, Y, C, X, Y]
	}

}
