package jp.co.shoeisha.javarecipe.chapter04.recipe099;

import java.util.Arrays;

public class ArrayBinarySearchSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] array = {30, 10, 20, 15};

		// まず配列をソートしておく
		Arrays.sort(array);	// => [10, 15, 20, 30]

		// 15が格納されたインデックスを取得
		int result1 = Arrays.binarySearch(array, 15);	// => 1

		// 1が格納されたインデックスを取得
		int result2 = Arrays.binarySearch(array, 1);	// => -1
	}

}
