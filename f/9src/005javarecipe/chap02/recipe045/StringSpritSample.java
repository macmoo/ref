package jp.co.shoeisha.javarecipe.chapter02.recipe045;

public class StringSpritSample {

	public static void main(String[] args) {
		String source = "A,B,C,";
		// カンマで分割
		String[] result1 = source.split(","); // => {"A", "B", "C"}
		for(String str : result1) System.out.println(str);
		// カンマで2つに分割
		String[] result2 = source.split(",", 2); // => {"A", "B,C,"}
		for(String str : result2) System.out.println(str);
		// カンマで4つに分割
		String[] result3 = source.split(",", 3); // => {"A", "B", "C", ""}
		for(String str : result3) System.out.println(str);
		//第2引数に0を指定(第2引数なしの場合と同じ)
		String[] result4 = source.split(",", 0); // => {"A", "B", "C"}
		for(String str : result4) System.out.println(str);
		//第2引数に負の値を指定(分割数の制限なしかつ末尾の空文字列を含む)
		String[] result5 = source.split(",", -1); // => {"A", "B", "C", ""}
		for(String str : result5) System.out.println(str);
	}

}
