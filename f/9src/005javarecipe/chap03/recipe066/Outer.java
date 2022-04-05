package jp.co.shoeisha.javarecipe.chapter03.recipe066;

// 外部クラス（エンクロージング型）
public class Outer {

	private String outerField = "outer ";

	// インナークラス（ネストした型）
	public class Inner {
		private String innerField = "inner";

		public String innerMethod() {
			// 外部クラスのメソッドやフィールドへ直接アクセス可能
			outerMethod();
			return outerField + innerField;
		}
	}

	// staticなネストクラス（ネストした型）
	public static class Nested {
		private String nestedField = "nested";

		public String nestedMethod() {
			// 外部クラスのメソッドやフィールドには直接アクセス不可
//			outerMethod();		// エラー
//			return outerField;	// エラー
			return nestedField;
		}
	}

	// ネストした列挙型（staticを省略）
	public enum Sex {
		MAN, WOMAN
	}

	public void outerMethod() {
		Inner inner = new Inner();

		// インナークラスのprivateフィールドへアクセス可能
		System.out.println(inner.innerField);
		System.out.println(inner.innerMethod());


		Nested nested = new Nested();

		// staticなネストクラスのprivateフィールドへアクセス可能
		System.out.println(nested.nestedField);
		System.out.println(nested.nestedMethod());
	}

}
