package jp.co.shoeisha.javarecipe.chapter04.recipe132;

import java.util.Arrays;
import java.util.List;

public class StreamForEachSample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		// Streamの各要素を標準出力に出力する
		list.stream().forEach(s -> System.out.println(s));
		
		// ラムダ式の代わりにメソッド参照を渡すことも可能
		list.stream().forEach(System.out::println);
	}

}
