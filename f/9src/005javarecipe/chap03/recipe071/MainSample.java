package jp.co.shoeisha.javarecipe.chapter03.recipe071;

public class MainSample {

	public static void main(String[] args) {

		// staticフィールドを呼び出す
		String str = StaticMember.staticField;
		System.out.println(str);

		// staticメソッドを呼び出す
		StaticMember.staticMethod();
	}

}
