package jp.co.shoeisha.javarecipe.chapter02.recipe041;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "Groovy");
		
		// ラムダ式で記述した場合
		list.forEach((s) -> System.out.println(s));
		
		// メソッド参照を使用した場合
		list.forEach(System.out::println);
	}

}
