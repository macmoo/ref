package jp.co.shoeisha.javarecipe.chapter03.recipe069;

public class MainSample {

	public static void main(String[] args) {

		// サブクラスのインスタンス化
		AbstractClass instance = new SubClass();

		// 抽象クラスに定義したexecute()メソッドを実行すると加算処理を行なう
		instance.execute();
	}

}
