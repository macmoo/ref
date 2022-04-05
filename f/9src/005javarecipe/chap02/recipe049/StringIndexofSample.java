package jp.co.shoeisha.javarecipe.chapter02.recipe049;

public class StringIndexofSample {

	public static void main(String[] args) {
		String source = "Hello World. World is Wonderful.";
		// "World"が最初に登場するインデックス
		int result1 = source.indexOf("World"); // => 6
		System.out.println(result1);
		// "World"が8文字目以降で最初に登場するインデックス
		int result2 = source.indexOf("World", 7); // => 13
		System.out.println(result2);
		// "Java"が最初に登場するインデックス
		int result3 = source.indexOf("Java"); //=>-1(登場しない)
		System.out.println(result3);
		// "World"を後方から検索して最初に登場するインデックス
		int result4 = source.lastIndexOf("World"); // => 13
		System.out.println(result4);
	}

}
