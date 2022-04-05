package jp.co.shoeisha.javarecipe.chapter04.recipe104;

import java.util.ArrayList;
import java.util.List;

public class ListSetForJava8Sample {

	// Listの要素を置き換える(List#replaceAll()の利用)
	// JDK8以降のみ動作
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); // => [A, B, C]

		// すべての要素を小文字に変換
		list.replaceAll(s -> s.toLowerCase());
		System.out.println(list); // => [a, b, c]
	}

}
