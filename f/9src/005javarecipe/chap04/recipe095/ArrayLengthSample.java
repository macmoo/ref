package jp.co.shoeisha.javarecipe.chapter04.recipe095;

public class ArrayLengthSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////
		// 配列の長さを調べる
		/////////////////////////////////////////////////////
		{
			String[] stringArray = {"A", "B", "C"};
			System.out.println(stringArray.length);	// => 3
		}
		/////////////////////////////////////////////////////
		// 配列の要素数を確認してから処理を行う
		/////////////////////////////////////////////////////
		{
			String[] array = {"a", "b"};

			// 要素が1つもない場合はArrayIndexOutOfBoundsExceptionがスローされる
			System.out.println("先頭の要素=" + array[0]);

			// 要素が1つ以上あることを確認してから処理を実行
			if (array.length > 0) {
				System.out.println("先頭の要素=" + array[0]);
			}
		}
	}

}
