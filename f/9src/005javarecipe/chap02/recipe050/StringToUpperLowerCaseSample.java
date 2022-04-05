package jp.co.shoeisha.javarecipe.chapter02.recipe050;

public class StringToUpperLowerCaseSample {

	public static void main(String[] args) {
		String source = "Hello World.";
		// 大文字に変換
		String result1 = source.toUpperCase(); // => "HELLO WORLD."
		System.out.println(result1);
		// 小文字に変換
		String result2 = source.toLowerCase(); // => "hello world."
		System.out.println(result2);
	}

}
