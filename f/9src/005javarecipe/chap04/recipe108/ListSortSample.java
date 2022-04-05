package jp.co.shoeisha.javarecipe.chapter04.recipe108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Listを昇順にソートする
		/////////////////////////////////////////////
		{
			List<String> list = new ArrayList<>();
			list.add("apple");
			list.add("strawberry");
			list.add("blueberry");
			list.add("orange");

			// 昇順でのソート
			Collections.sort(list);
			System.out.println(list);		// => [apple, blueberry, orange, strawberry]

			// 降順でのソート
			Collections.reverse(list);
			System.out.println(list);		// => [strawberry, orange, blueberry, apple]
		}
		/////////////////////////////////////////////
		// 文字列長によるListのソート例
		/////////////////////////////////////////////
		{
			List<String> list = new ArrayList<>();
			list.add("apple");
			list.add("strawberry");
			list.add("blueberry");
			list.add("orange");

			// 独自の並べ替えルール（この例では文字列長）でListをソート
			Collections.sort(list, new StringLengthComparator());
			System.out.println(list);		// => [apple, orange, blueberry, strawberry]
		}
	}

}
