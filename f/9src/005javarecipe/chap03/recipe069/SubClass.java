package jp.co.shoeisha.javarecipe.chapter03.recipe069;

/**
 * サブクラス
 */
public class SubClass extends AbstractClass {

	/**
	 * 抽象メソッドを実装
	 */
	@Override
	public int calculate(int value1, int value2) {
		return value1 + value2;
	}

}
