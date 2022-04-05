package jp.co.shoeisha.javarecipe.chapter09.recipe260;

public class CalcUtils {

	// x/yの結果をfloatで返すメソッド
	public static float divide(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException("0で除算");
		}
		return i / j;
	}

	public static int sum(int i, int j) {
		return i + j;
	}

}