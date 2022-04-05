package jp.co.shoeisha.javarecipe.chapter04.recipe115;

import java.util.HashSet;
import java.util.Set;

public class SetForForJava8Sample {

    // Setの要素の繰り返し処理
	// JDK8以降のみ動作
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		// forEachメソッドを使用した場合（Java 8以降）
		set.forEach(s -> System.out.println("[" + s + "]")); // => [A] [B] [C]
    }

}
