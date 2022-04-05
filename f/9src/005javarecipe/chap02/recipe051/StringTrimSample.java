package jp.co.shoeisha.javarecipe.chapter02.recipe051;

public class StringTrimSample {

	public static void main(String[] args) {
		// 前後の空白を削除
		String result = " Hello World. ".trim(); // => "Hello World."
		System.out.println(result);
	}

}
