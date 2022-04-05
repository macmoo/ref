package jp.co.shoeisha.javarecipe.chapter03.recipe065;

public class InterfaceSample {

	public static void main(String[] args) {

		String result = new HelloWorldImpl().hello("Takako");
		System.out.println(result);

		new C().method();

	}

	/////////////////////////////////////////////////////////////////////////////
	// 実行したいデフォルト実装を指定する
	/////////////////////////////////////////////////////////////////////////////
	static interface A {
		default void method() {
			System.out.println("Aのデフォルト実装メソッド");
		}
	}
	static interface B {
		default void method() {
			System.out.println("Bのデフォルト実装メソッド");
		}
	}
	static class C implements A, B {
		@Override
		public void method() {
			// Aのデフォルト実装を呼び出す
			A.super.method();
		}
	}

}
