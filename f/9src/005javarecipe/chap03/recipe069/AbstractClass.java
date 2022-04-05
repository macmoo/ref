package jp.co.shoeisha.javarecipe.chapter03.recipe069;

/**
 * 抽象クラス
 */
public abstract class AbstractClass {

	/**
	 * 抽象メソッド
	 *
	 * @param value1 値1
	 * @param value2 値2
	 * @return 計算結果
	 */
	public abstract int calculate(int value1, int value2);

	public void execute() {
		System.out.println(calculate(10, 20));
	}

}
