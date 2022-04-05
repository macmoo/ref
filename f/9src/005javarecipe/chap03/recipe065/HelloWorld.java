package jp.co.shoeisha.javarecipe.chapter03.recipe065;

/**
 * インターフェースを定義。
 */
public interface HelloWorld {

	// メソッドにデフォルト実装を定義する
	default public String hello(String name) {
		return "Hello " + name;
	}

}
