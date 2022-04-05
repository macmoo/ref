package jp.co.shoeisha.javarecipe.chapter03.recipe091;

import java.io.Serializable;

/**
 * シリアライズ対象のクラス
 */
public class SampleBean implements Serializable {

	// フィールドはプリミティブ型、シリアライズ可能なクラスのみ定義可能
	private int id = 10;
	private String name = "文字列";

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
