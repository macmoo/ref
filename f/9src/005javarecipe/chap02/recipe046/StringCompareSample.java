package jp.co.shoeisha.javarecipe.chapter02.recipe046;

public class StringCompareSample {

	public static void main(String[] args) {
		String source = "Hello";
		// 文字列が等しいか調べる
		boolean result1 = source.equals("Hello"); // => true
		System.out.println(result1);
		// 大文字小文字を無視して等しいかを調べる
		boolean result2 = source.equalsIgnoreCase("hello"); // => true
		System.out.println(result2);
	}

}
