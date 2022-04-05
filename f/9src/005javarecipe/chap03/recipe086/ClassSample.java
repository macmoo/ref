package jp.co.shoeisha.javarecipe.chapter03.recipe086;

public class ClassSample {

	public static void main(String[] args) throws ClassNotFoundException {

		/////////////////////////////////////////////////////////////////////////////
		// Classインスタンスを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// クラス名.class
			Class<Exception> e = Exception.class;
			System.out.println(e);
		}

		{
			// getClass()メソッド
			Exception instance = new Exception();
			Class<? extends Exception> e = instance.getClass();
			System.out.println(e);
		}

		{
			// Class#forName()メソッド
			Class<?> e = Class.forName("java.lang.Exception");
			System.out.println(e);
		}

		/////////////////////////////////////////////////////////////////////////////
		// クラスの情報を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// RunnableインターフェースのClassインスタンスを取得
			Class<Runnable> c = Runnable.class;

			// インターフェースかどうか
			System.out.println(c.isInterface());	// => true

			// アノテーションかどうか
			System.out.println(c.isAnnotation());	// => false

			// 配列かどうか
			System.out.println(c.isArray());		// => false

			// 列挙型かどうか
			System.out.println(c.isEnum());			// => false

			// 引数のインスタンスがRunnable型かどうか
			System.out.println(c.isInstance(new Thread()));			// => true

			// 引数のクラスがRunnableのサブクラス/実装クラスかどうか
			System.out.println(c.isAssignableFrom(Thread.class));	// => true
		}

	}

}
