package jp.co.shoeisha.javarecipe.chapter04.recipe094;

public class ArraySample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////
		// 配列を生成する
		/////////////////////////////////////////////
		{
			// 要素数10のint型配列を生成
			int[] intArray = new int[10];

			// 要素数5のString型配列を生成
			String[] stringArray = new String[5];
		}
		/////////////////////////////////////////////
		//要素を指定して配列を生成する  
		/////////////////////////////////////////////
		{
			// 要素を指定してint型配列を生成
			int[] intArray = {1, 2, 3, 4, 5};

			// 要素を指定してString型配列を生成
			String[] stringArray = {"A", "B", "C"};
		}
		/////////////////////////////////////////////
		//配列の要素を取得・設定する
		/////////////////////////////////////////////
		{
			String[] array = {"A", "B", "C"};

			// 配列の要素を取得
			System.out.println(array[0]);	// => A
			System.out.println(array[1]);	// => B
			System.out.println(array[2]);	// => C

			// 配列の要素を設定
			array[0] = "D";
			array[1] = "E";
			array[2] = "F";
		}
		/////////////////////////////////////////////
		// 二次元配列を生成する
		/////////////////////////////////////////////
		{
			// int型の二次元配列を生成
			int[][] intArray = new int[3][2];

			// String型の二次元配列を生成
			String[][] stringArray = new String[2][3];
		}
		/////////////////////////////////////////////
		//要素を指定して多次元配列を生成する
		/////////////////////////////////////////////
		{
			// 要素を指定してint型の二次元配列を生成
			int[][] intArray = {{1, 2}, {3, 4}, {5, 6}};

			// 要素を指定してString型の二次元配列を生成
			String[][] stringArray = {{"A", "B", "C"}, {"D", "E", "F"}};
		}
	}

}
