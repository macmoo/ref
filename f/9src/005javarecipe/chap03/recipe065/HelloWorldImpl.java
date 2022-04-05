package jp.co.shoeisha.javarecipe.chapter03.recipe065;

/**
 * {@code HelloWorld}の実装クラスを定義。
 */
public class HelloWorldImpl implements HelloWorld {

	// デフォルト実装をオーバーライド
	@Override
	public String hello(String name) {
		// superを使ってデフォルト実装を呼び出す
		return String.format("*** %s ***", HelloWorld.super.hello(name));
	}

}
