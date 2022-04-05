package jp.co.shoeisha.javarecipe.chapter03.recipe064;

public class InterfaceSample {

	public static void main(String[] args) {

		// 実装クラスのインスタンス化
		HelloWorld instance = new HelloWorldImpl();
		instance.hello("Takako");

	}

}
