package jp.co.shoeisha.javarecipe.chapter03.recipe073;

public class VariableArgumentsSample {

	public static void main(String[] args) {

		// 引数なし
		method();

		// 引数1つ
		method("a");

		// 引数2つ以上
		method("a", "b");

	}

	/////////////////////////////////////////////////////////////////////////////
	// 可変長引数の定義
	/////////////////////////////////////////////////////////////////////////////
	public static void method(String... args) {
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
