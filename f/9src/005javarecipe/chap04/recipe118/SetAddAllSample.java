package jp.co.shoeisha.javarecipe.chapter04.recipe118;

import java.util.HashSet;
import java.util.Set;

public class SetAddAllSample {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");

		Set<String> set2 = new HashSet<>();
		set2.add("E");
		set2.add("F");

		// set1とset2を連結
		set1.addAll(set2);
		System.out.println(set1);	// => [D, E, F, A, B, C]
	}

}
