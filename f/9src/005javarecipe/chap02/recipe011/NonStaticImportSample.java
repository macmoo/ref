package jp.co.shoeisha.javarecipe.chapter02.recipe011;

public class NonStaticImportSample {

	public void calculate(double d, int r) {
		// staticメソッドの呼び出し
		long value = Math.round(d);
		System.out.println(value);

		// staticフィールドの参照
		double area = r * r * Math.PI;
		System.out.println(area);
	}

}
