package jp.co.shoeisha.javarecipe.chapter04.recipe117;

import java.util.HashSet;
import java.util.Set;

public class SetContainsSample {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");

		Set<String> set2 = new HashSet<>();
		set2.add("B");
		set2.add("C");

		Set<String> set3 = new HashSet<>();
		set3.add("A");
		set3.add("D");

		// 指定した要素がSetに含まれているか調べる
		System.out.println(set1.contains("A"));       // => true
		System.out.println(set1.contains("D"));       // => false

		// 指定したコレクションのすべての要素がSetに含まれているか調べる
		System.out.println(set1.containsAll(set2));   // => true
		System.out.println(set1.containsAll(set3));   // => false
	}

}
