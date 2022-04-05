package jp.co.shoeisha.javarecipe.chapter03.recipe087;

public class NewInstanceSample {

	public static void main(String[] args) {

		try {
			// 引数なし
			StringBuilder sb1 = StringBuilder.class.getConstructor().newInstance();
			System.out.println(sb1.toString());

			// 引数あり
			StringBuilder sb2 = StringBuilder.class.getConstructor(String.class).newInstance("初期値");
			System.out.println(sb2.toString());

		} catch (ReflectiveOperationException e) {
			throw new RuntimeException(e);
		}

	}

}
