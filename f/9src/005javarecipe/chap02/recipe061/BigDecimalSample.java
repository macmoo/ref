package jp.co.shoeisha.javarecipe.chapter02.recipe061;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalSample {

	public static void main(String[] args) {
		// doubleで計算すると丸め誤差が発生する
		double result = 1.1 + 2.2; // => 3.3000000000000003
		System.out.println(result);

		// BigDecimalのインスタンスを生成
		BigDecimal bd = new BigDecimal("1.1");
		// BigDecimalの足し算、引き算、乗算
		BigDecimal bdAdd = new BigDecimal("2.2").add(bd); // => 3.3
		System.out.println(bdAdd);
		BigDecimal bdSubtract = new BigDecimal("2.2").subtract(bd); // => 1.1
		System.out.println(bdSubtract);
		BigDecimal bdMultiply = new BigDecimal("2.2").multiply(bd); // => 2.42
		System.out.println(bdMultiply);
		// 割り算は小数第5位で四捨五入
		BigDecimal bdDivide = new BigDecimal("2.2").divide(bd, 4, RoundingMode.HALF_UP); // => 2.0000
		System.out.println(bdDivide);
	}

}
