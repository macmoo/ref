package jp.co.shoeisha.javarecipe.chapter04.recipe109;

import java.util.ArrayList;
import java.util.List;

public class ListContainsSample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");	// => [A, B, C, B]

		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");

		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("D");

		// 指定した要素がListに含まれているか調べる
		System.out.println(list1.contains("A"));        // => true
		System.out.println(list1.contains("D"));        // => false

		// 指定したコレクションのすべての要素がListに含まれているか調べる
		System.out.println(list1.containsAll(list2));   // => true
		System.out.println(list1.containsAll(list3));   // => false

		// 指定された要素がList内で「最初に」検出されたインデックスを返す
		System.out.println(list1.indexOf("C"));         // => 2

		// 指定された要素がListにない場合、-1を返す
		System.out.println(list1.indexOf("E"));         // => -1

		// 指定された要素がList内で「最後に」検出されたインデックスを返す
		System.out.println(list1.lastIndexOf("B"));     // => 3

		// 指定された要素がListにない場合、-1を返す
		System.out.println(list1.lastIndexOf("E"));     // => -1
	}

}
