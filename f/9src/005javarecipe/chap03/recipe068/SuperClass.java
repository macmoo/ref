package jp.co.shoeisha.javarecipe.chapter03.recipe068;

/**
 * スーパークラス（基底クラスまたは親クラス）
 */
public class SuperClass {

	private String superField;

	static {
		System.out.println("スーパークラス: staticイニシャライザ");
	}

	{
		System.out.println("スーパークラス: インスタンスイニシャライザ");
	}

	// コンストラクタ
	public SuperClass(String arg) {
		superField = arg;

		System.out.println("スーパークラス: コンストラクタ");
	}

	protected String superMethod() {
		return superField;
	}

}
