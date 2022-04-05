package jp.co.shoeisha.javarecipe.chapter04.recipe114;

import java.util.HashSet;
import java.util.Set;

public class SetRemoveForJava8Sample {

    // 条件に一致する要素を削除する
	// JDK8以降のみ動作
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JavaScript");
		set.add("CSS");
		set.add("HTML");

		// 先頭が"J"で始まる要素を削除
		set.removeIf(s -> s.startsWith("J")); // => true
		System.out.println(set);              // => [CSS, HTML]
	}

}
