package jp.co.shoeisha.javarecipe.chapter04.recipe105;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveForJava8Sample {

	// 条件に一致する要素を削除する(List#removeIf()の利用)
	// JDK8以降のみ動作
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JavaScript");
		list.add("CSS");
		list.add("HTML");

		// 先頭が"J"で始まる要素を削除
		list.removeIf(s -> s.startsWith("J")); // => true
		System.out.println(list);              // => [CSS, HTML]
	}

}
