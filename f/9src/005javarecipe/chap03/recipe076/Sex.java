package jp.co.shoeisha.javarecipe.chapter03.recipe076;

public enum Sex implements Color {
	MAN {
		// enum定数ごとにメソッドを実装
		@Override
		public String getColor() {
			return "青";
		}
	},
	WOMAN {
		@Override
		public String getColor() {
			return "赤";
		}
	};
}
