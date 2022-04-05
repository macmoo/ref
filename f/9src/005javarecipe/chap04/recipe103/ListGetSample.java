package jp.co.shoeisha.javarecipe.chapter04.recipe103;

import java.util.ArrayList;
import java.util.List;

public class ListGetSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Listの要素を取得する
		/////////////////////////////////////////////
		{
			List<String> list = new ArrayList<>();
			list.add("A");
			list.add("B");
			list.add("C");
			System.out.println(list);	// => [A, B, C]

			// インデックス1の要素を取得する
			System.out.println(list.get(1));	// => B
		}
		/////////////////////////////////////////////
		// Listの要素数を確認してから処理を行なう
		/////////////////////////////////////////////
		{
			List<String> list = new ArrayList<>();

			// Listが空の場合はIndexOutOfBoundsExceptionがスローされる
			System.out.println("先頭の要素" + list.get(0));

			// 要素が1つ以上あることを確認してから処理を実行
			if (list.size() > 0) {
				System.out.println("先頭の要素" + list.get(0));
			}
		}
	}

}
