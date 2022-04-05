package jp.co.shoeisha.javarecipe.chapter02.recipe027;

public class BlockSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// if文によるブロック
		/////////////////////////////////////////////////////////////////////////////
		{
			// ブロック外で宣言した変数
			String name = "Takako";

			if(name != null){
				// ブロック外で宣言した変数nameをブロック内で参照可能
				String message = "Hello " + name + "!";
				System.out.println(message);
			}

			// ブロック内で宣言した変数をブロック外で参照することはできない
//			System.out.println(message); // => コンパイルエラー
		}


		/////////////////////////////////////////////////////////////////////////////
		// ブロックで変数のスコープを限定する
		/////////////////////////////////////////////////////////////////////////////
		{
			String name = "Takako";
			System.out.println("Hello " + name + "!");
		}

		{
			// 上のスコープと同じ名前の変数を使用できる
			String name = "Naoki";
			System.out.println("Hello " + name + "!");
		}

	}

}
