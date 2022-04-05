package jp.co.shoeisha.javarecipe.chapter03.recipe063;

public class HelloWorld {

	// 初期値あり
	private String message = "Hello ";

	// 初期値なしの場合は、型に応じたデフォルト値となる
	private int f1;		// => 0
	private String f2;	// => null

	// 戻り値あり
	public String getHello(String name) {
		// return文を使って戻り値を返す
		return message + name;
	}

	// 戻り値なしの場合は、戻り値の型にvoidを指定する
	public void printHello(String name) {
		// return文は省略可能
		System.out.println(message + name);
	}

	public int getF1() {
		return f1;
	}

	public String getF2() {
		return f2;
	}

}
