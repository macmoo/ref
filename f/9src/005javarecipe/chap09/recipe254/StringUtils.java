package jp.co.shoeisha.javarecipe.chapter09.recipe254;

public class StringUtils {

	public static boolean isEmpty(String value) {
		// 引数がnullまたは空文字の場合、trueを返却する
		if (value == null || "".equals(value)) {
			return true;
		} else {
			return false;
		}
	}

	// StringUtils.compare(String args1, String args2)は文字列長を比較するメソッド
	// args1 > args2の場合1、args1 == args2の場合0、args1 < args2の場合-1を返す
	public static int compare(String args1, String args2) {
		if (args1.length() > args2.length()) {
			return 1;
		} else if (args1.length() == args2.length()) {
			return 0;
		} else {
			return -1;
		}
	}

}
