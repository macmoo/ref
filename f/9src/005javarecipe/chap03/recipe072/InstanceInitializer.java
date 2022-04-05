package jp.co.shoeisha.javarecipe.chapter03.recipe072;

public class InstanceInitializer {

	// インスタンスイニシャライザ
	{
		System.out.println("コンストラクタより前に実行");
	}

	public InstanceInitializer() {
		System.out.println("コンストラクタ実行");
	}

}
