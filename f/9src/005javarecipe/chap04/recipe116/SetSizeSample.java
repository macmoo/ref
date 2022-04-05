package jp.co.shoeisha.javarecipe.chapter04.recipe116;

import java.util.HashSet;
import java.util.Set;

public class SetSizeSample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);             // => [A, B, C]

		// Setの要素数（サイズ）を調べる
		System.out.println(set.size());      // => 3

		// Setが空かどうかを調べる
		System.out.println(set.isEmpty());   // => false
	}

}
