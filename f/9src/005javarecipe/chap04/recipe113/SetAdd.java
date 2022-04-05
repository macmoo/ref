package jp.co.shoeisha.javarecipe.chapter04.recipe113;

import java.util.HashSet;
import java.util.Set;

public class SetAdd {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// Setに要素を追加
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set.add("A")); // => すでに要素があるためfalse
		System.out.println(set.add("D")); // => true
		System.out.println(set);          // => [D, A, B, C]
	}

}
