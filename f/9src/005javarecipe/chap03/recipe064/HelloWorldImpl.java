package jp.co.shoeisha.javarecipe.chapter03.recipe064;

/**
 * {@code HelloWorld}の実装クラスを定義。
 */
public class HelloWorldImpl implements HelloWorld {

	@Override
	public void hello(String name) {
		System.out.println(MESSAGE + name);
	}

}
