package jp.co.shoeisha.javarecipe.chapter04.recipe114;

import java.util.HashSet;
import java.util.Set;

public class SetRemoveSample {

	public static void main(String[] args) {
		// Setの生成
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("E");
		set1.add("F");
		set1.add("D");
		System.out.println(set1);                   // => [D, E, F, A, B, C]

		// 削除対象の要素を格納
		Set<String> set2 = new HashSet<>();
		set2.add("D");
		set2.add("E");

		// 削除しない対象の要素を格納
		Set<String> set3 = new HashSet<>();
		set3.add("B");
		set3.add("C");

		// Setの要素を削除する。削除した場合はtrueを返す
		System.out.println(set1.remove("A"));       // => true
		System.out.println(set1.remove("G"));       // => false
		System.out.println(set1);                   // => [D, E, F, B, C]

		// 指定したコレクションのすべての要素を削除し、Setが変更されたらtrueを返す
		System.out.println(set1.removeAll(set2));   // => true
		System.out.println(set1);                   // => [F, B, C]

		// 指定したコレクション以外のすべての要素を削除し、Setが変更されたらtrueを返す
		System.out.println(set1.retainAll(set3));   // => true
		System.out.println(set1);                   // => [B, C]

		// すべての要素を削除
		set1.clear();
		System.out.println(set1.size());            // => 0
		System.out.println(set1.isEmpty());         // => true
	}

}
