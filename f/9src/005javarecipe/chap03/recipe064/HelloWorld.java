package jp.co.shoeisha.javarecipe.chapter03.recipe064;

/**
 * インターフェースを定義。
 */
public interface HelloWorld {

	// アクセス修飾子を省略するとpublicになる
	// 定数のstatic finalも省略可能
	public static final String MESSAGE = "Hello ";

	public void hello(String name);

}
