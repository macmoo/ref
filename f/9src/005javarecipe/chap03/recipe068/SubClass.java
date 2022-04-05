package jp.co.shoeisha.javarecipe.chapter03.recipe068;

/**
 * サブクラス（派生クラスまたは子クラス）
 */
public class SubClass extends SuperClass {

	static {
		System.out.println("サブクラス: staticイニシャライザ");
	}

	{
		System.out.println("サブクラス: インスタンスイニシャライザ");
	}

	// コンストラクタ
	public SubClass(String arg) {
		// スーパークラスのコンストラクタを呼び出す
		super(arg);

		System.out.println("サブクラス: コンストラクタ");
	}

	public void print() {
		// スーパークラスのメンバはサブクラスに引き継がれる
		System.out.println(superMethod());
	}

}
