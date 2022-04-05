package jp.co.shoeisha.javarecipe.chapter02.recipe011;

import static java.lang.Math.round;
import static java.lang.Math.PI;

public class StaticImportSample {

	public void calculate(double d, int r) {
		// staticメソッドの呼び出し
		long value = round(d);
		System.out.println(value);

		// staticフィールドの参照
		double area = r * r * PI;
		System.out.println(area);
	}

}
