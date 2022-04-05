package jp.co.shoeisha.javarecipe.chapter03.recipe070;

public class SubClass extends SuperClass {

	// オーバーライドするメソッドには@Overrideアノテーションを付けておく
	// アクセス修飾子は制限が弱いものでオーバーライド可能
	@Override
	public String method() {
		// スーパークラスのメソッドを呼び出す
		System.out.println(super.method());

		return "サブクラス";
	}

}
