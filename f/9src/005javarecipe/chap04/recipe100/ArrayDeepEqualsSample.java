package jp.co.shoeisha.javarecipe.chapter04.recipe100;

import java.util.Arrays;

public class ArrayDeepEqualsSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		// 配列を比較する
		/////////////////////////////////////////////
		{
			int[][] intArray1 = {{1, 2, 3}, {4, 5, 6}};
			int[][] intArray2 = {{1, 2, 3}, {4, 5, 6}};

			System.out.println(Arrays.deepEquals(intArray1, intArray2));	// => true
		}
		/////////////////////////////////////////////
		// Note(配列を比較する)
		/////////////////////////////////////////////
		{
			int[][] intArray1 = {{1, 2, 3}, {4, 5, 6}};
			int[][] intArray2 = {{1, 2, 3}, {4, 5, 6}};

			//Arrays#equals()メソッドを使った場合
			System.out.println(Arrays.equals(intArray1, intArray2));	// => false
		}
	}

}
