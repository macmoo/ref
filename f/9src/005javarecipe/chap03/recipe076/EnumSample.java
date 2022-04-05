package jp.co.shoeisha.javarecipe.chapter03.recipe076;

public class EnumSample {

	public static void main(String[] args) {

		Color color1 = Sex.MAN;
		String str1 = color1.getColor();	// => 青
		System.out.println(str1);

		Color color2 = Sex.WOMAN;
		String str2 = color2.getColor();	// => 赤
		System.out.println(str2);
	}

}
