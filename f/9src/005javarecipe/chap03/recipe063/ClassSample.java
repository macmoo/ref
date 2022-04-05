package jp.co.shoeisha.javarecipe.chapter03.recipe063;

public class ClassSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// クラスを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// クラスのインスタンス化
			HelloWorld instance = new HelloWorld();

			// メソッドを呼び出す
			String result = instance.getHello("Takako");
			System.out.println(result);

			instance.printHello("Takako");

			System.out.println(instance.getF1());
			System.out.println(instance.getF2());
		}

		/////////////////////////////////////////////////////////////////////////////
		// 引数なしのコンストラクタを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// 引数なしのコンストラクタを使ってインスタンス化
			ConstructorSample instance = new ConstructorSample();

			System.out.println(instance.getName());
			System.out.println(instance.getGender());
		}

		/////////////////////////////////////////////////////////////////////////////
		// 引数ありのコンストラクタを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// 引数ありのコンストラクタを使ってインスタンス化
			ConstructorSample instance = new ConstructorSample("Takako", "女");

			System.out.println(instance.getName());
			System.out.println(instance.getGender());
		}

	}

}
