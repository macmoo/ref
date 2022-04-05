package jp.co.shoeisha.javarecipe.chapter04.recipe111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArraySample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Listを配列に変換する
		/////////////////////////////////////////////
		{
			List<String> list = new ArrayList<>();
			list.add("A");
			list.add("B");
			list.add("C");

			// 型安全性のため、引数のあるtoArrayメソッドを利用
			String[] array = list.toArray(new String[list.size()]);
			System.out.println(Arrays.toString(array));    // => [A, B, C]
		}
		/////////////////////////////////////////////
		// 配列をListに変換する
		/////////////////////////////////////////////
		{
			String[] array = {"A", "B", "C", "D"};
			List<String> list = Arrays.asList(array);
			System.out.println(list);   // => [A, B, C, D]
		}
		/////////////////////////////////////////////
		// Arrays#asListメソッドを利用したListの生成
		/////////////////////////////////////////////
		{
			List<String> list = Arrays.asList("apple", "orange", "pineapple", "strawberry");
		}
	}

}
