package jp.co.shoeisha.javarecipe.chapter03.recipe084.full;

/**
 * フル・アノテーション
 * 利用例: @Check(id = 1, value = "message")
 */
public @interface Check {
	String value();
	int id();
}
