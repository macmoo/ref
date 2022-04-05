package jp.co.shoeisha.javarecipe.chapter04.recipe115;

import java.util.HashSet;
import java.util.Set;

public class SetForSample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		// 拡張for文を使用した場合
		for (String value : set) {
			System.out.println("(" + value + ")");	// => (A) (B) (C)
		}
	}

}
