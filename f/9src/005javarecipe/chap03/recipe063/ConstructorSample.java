package jp.co.shoeisha.javarecipe.chapter03.recipe063;

public class ConstructorSample {

	private String name;
	private String gender;

	// 引数なしコンストラクタ
	public ConstructorSample() {
		// これはOK
		this("unknown", "unknown");
	}

	// 引数ありコンストラクタ
	public ConstructorSample(String name) {
		// 別のコンストラクタの呼び出し前に処理があるのでコンパイルエラー
		System.out.println(name);
//		this(name, "unknown");
	}

	// 引数ありコンストラクタ
	public ConstructorSample(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

}
