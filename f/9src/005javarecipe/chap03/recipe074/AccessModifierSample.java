package jp.co.shoeisha.javarecipe.chapter03.recipe074;

public class AccessModifierSample {

	// private：このクラス内のみ参照可能
	private String name;

	// public：すべてのクラスから参照可能
	public String getName() {
		return this.name;
	}

	// protected：このクラス内および同一パッケージ内から参照可能
	// 別パッケージはサブクラスのみ参照可能
	protected void setName(String name) {
		this.name = name;
	}

	// なし：このクラス内および同一パッケージ内から参照可能
	void printName() {
		System.out.println(this.name);
	}

}
