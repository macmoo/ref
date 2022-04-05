package jp.co.shoeisha.javarecipe.chapter02.recipe018;

public class LogicalOperatorSample {

	public static void main(String[] args) {
		String value = "abc";
		
		// 文字列がnullだった場合にもvalue.length != 0が実行されてしまうため、
		// NullPointerExceptionが発生してしまう
		if (value != null & value.length() != 0) {
			System.out.println(value);
		}
		
		// 文字列がnullだった場合にはvalue.length != 0は実行されないので
		// NullPointerExceptionは発生しない
		if (value != null && value.length() != 0) {
			System.out.println(value);
		}
	}

}
