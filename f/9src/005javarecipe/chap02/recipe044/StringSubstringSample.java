package jp.co.shoeisha.javarecipe.chapter02.recipe044;

public class StringSubstringSample {

	public static void main(String[] args) {
		String source = "こんにちわ世界";
		// 6文字目以降を切り出す
		String result1 = source.substring(5); // => "世界"
		System.out.println(result1);
		// 3文字目から5文字目までを切り出す
		String result2 = source.substring(2,5); // => "にちわ"
		System.out.println(result2);
		}

}
