package jp.co.shoeisha.javarecipe.chapter02.recipe027;

public class IfSample {

	public static void main(String[] args) {
		int i = 10;

		/////////////////////////////////////////////////////////////////////////////
		// if文を使った条件分岐
		/////////////////////////////////////////////////////////////////////////////

		// iが10より小さい場合
		if(i < 10) {
			System.out.println("10より小さい");

		// それ以外の場合
		} else {
			System.out.println("10以上");
		}

		// elseは省略可能
		if(i < 10) {
			System.out.println("10より小さい");
		}

		// 条件が複数の場合、最初にtrueとなった1ブロックのみ実行される
		if(i < 20 && i % 2 == 0) {
			System.out.println("20より小さいかつ偶数");
		} else if(i < 20) {
			System.out.println("20より小さい");
		} else {
			System.out.println("それ以外");
		}

	}

}
