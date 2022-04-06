package jp.co.shoeisha.javarecipe.chapter03.recipe075;

public class EnumSample {

	public static void main(String[] args) {

		// 列挙名を通してenum定数にアクセス
		compare(Sex.MAN);

		/////////////////////////////////////////////////////////////////////////////
		// 列挙型の暗黙のメソッド
		/////////////////////////////////////////////////////////////////////////////

		// 該当するenum定数のオブジェクトを取得
		Sex man = Sex.valueOf("MAN");
		System.out.println(man);

		// すべてのenum定数を取得
		for (Sex sex : Sex.values()) {
			// enum定数の名前
			System.out.print("name():" + sex.name());
				// => MAN、WOMANの順に出力

			// name()と同じ値
			System.out.print(" toString():" + sex.toString());

			// enum定数の順序番号
			System.out.print(" ordinal():" + sex.ordinal());
				// => MANは0、WOMANは1

			// 順序番号の比較（WOMANよりも前に定義されているか）
			System.out.println(" compareTo():" + sex.compareTo(Sex.WOMAN));
				// => MANは-1、WOMANは0
		}


		/////////////////////////////////////////////////////////////////////////////
		// コンストラクタで設定した初期値を取得
		/////////////////////////////////////////////////////////////////////////////
		Sex woman = Sex.WOMAN;
		int code = woman.getCode();
		System.out.println(code);	// => 2

	}

	/////////////////////////////////////////////////////////////////////////////
	// 列挙型の比較
	/////////////////////////////////////////////////////////////////////////////
	public static void compare(Sex sex) {
		switch (sex) {
		// case文にはenum定数を指定
		case MAN:
			System.out.println("男です");
			break;
		case WOMAN:
			System.out.println("女です");
			break;
		}
	}

}
// 男です
// MAN
// name():MAN toString():MAN ordinal():0 compareTo():-1
// name():WOMAN toString():WOMAN ordinal():1 compareTo():0
// 2
