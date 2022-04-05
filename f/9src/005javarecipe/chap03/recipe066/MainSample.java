package jp.co.shoeisha.javarecipe.chapter03.recipe066;

import jp.co.shoeisha.javarecipe.chapter03.recipe066.Outer.Inner;
import jp.co.shoeisha.javarecipe.chapter03.recipe066.Outer.Nested;
import jp.co.shoeisha.javarecipe.chapter03.recipe066.Outer.Sex;

public class MainSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Outer outer = new Outer();

		// 外部クラスのインスタンスからインナークラスをインスタンス化
		Inner inner = outer.new Inner();

		// 通常のクラスと同様にインスタンス化
		Nested nested = new Nested();

		// 列挙名を通してenum定数にアクセス
		Sex sex = Sex.MAN;
	}

}
