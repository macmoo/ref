package jp.co.shoeisha.javarecipe.chapter02.recipe048;

public class StringStartsEndsWithSample {

	public static void main(String[] args) {
		String source = "Hello World.";
		// 文字列が"Hello"で始まっているか?
		boolean result1 = source.startsWith("Hello"); // => true
		System.out.println(result1);
		// 文字列が"World"で終わっているか?
		boolean result2 = source.endsWith("World"); // => false
		System.out.println(result2);
		// 文字列が"World."で終わっているか?
		boolean result3 = source.endsWith("World."); // => true
		System.out.println(result3);
	}

}
