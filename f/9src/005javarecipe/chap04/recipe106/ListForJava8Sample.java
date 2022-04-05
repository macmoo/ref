package jp.co.shoeisha.javarecipe.chapter04.recipe106;

import java.util.ArrayList;
import java.util.List;

public class ListForJava8Sample {

	// Listの要素の繰り返し処理
	// JDK8以降のみ動作
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		// forEachメソッドを使用した場合（Java 8以降）
		list.forEach(s -> System.out.println("[" + s + "]")); // => [A] [B] [C]
	}

}
