package jp.co.shoeisha.javarecipe.chapter03.recipe074.sub;

import jp.co.shoeisha.javarecipe.chapter03.recipe074.AccessModifierSample;

public class SubPackage extends AccessModifierSample {

	public void callProtected() {
		// protectedメソッドを参照
		setName("Takako");
	}

	public void callNothing() {
		// 修飾子なしのメソッドは参照できない
//		printName();	// エラー
	}

}
