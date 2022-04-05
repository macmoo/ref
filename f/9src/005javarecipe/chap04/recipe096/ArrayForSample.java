package jp.co.shoeisha.javarecipe.chapter04.recipe096;

public class ArrayForSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		//配列の要素を繰り返し処理する
		/////////////////////////////////////////////
		{
			int[] array = {1, 2, 3};

			// 方法1：インデックスを利用した場合
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);	// => 1 2 3
			}

			// 方法2：拡張for文を利用した場合
			for (int value : array) {
				System.out.println(value);	// => 1 2 3
			}
		}

		/////////////////////////////////////////////
		//多次元配列の要素を繰り返し処理する
		/////////////////////////////////////////////
		{
			int[][] array = {{1, 2, 3}, {4, 5, 6}};

			// 方法1：インデックスを利用した場合
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.println(array[i][j]);	// => 1 2 3 4 5 6
				}
			}

			// 方法2：拡張for文を利用した場合
			for (int[] inArray : array) {
				for (int value : inArray) {
					System.out.println(value);	// => 1 2 3 4 5 6
				}
			}
		}
	}

}
