package jp.co.shoeisha.javarecipe.chapter03.recipe075;

public enum Sex {
	MAN(1), WOMAN(2); // ここでコンストラクタを呼び出している

	// コンストラクタ
	// アクセス修飾子は必ずprivate（privateは省略可能）
	private Sex(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	private final int code;
}
