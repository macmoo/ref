package jp.co.shoeisha.javarecipe.chapter04.recipe098;

import java.util.Arrays;

public class ArraySortSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		//配列をソートする
		/////////////////////////////////////////////
		{
			// 配列arrayを昇順にソートする
			String[] array = {"apple", "strawberry", "blueberry", "orange"};
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));
			// => [apple, blueberry, orange, strawberry]

			// 配列arrayRangeをインデックス1から3未満の範囲で昇順にソートする
			int[] arrayRange = {1, 5, 2, 4, 3};
			Arrays.sort(arrayRange, 1, 3);
			System.out.println(Arrays.toString(arrayRange)); // => [1, 2, 5, 4, 3]
		}
		/////////////////////////////////////////////
		//文字列長で配列をソートする
		/////////////////////////////////////////////
		{
			// 配列を文字列長でソートする
			String[] array = {"apple", "strawberry", "blueberry", "orange"};
			Arrays.sort(array, new StringLengthComparator());
			System.out.println(Arrays.toString(array));
			// =>[apple, orange, blueberry, strawberry]
		}
	}

}
