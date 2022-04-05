package jp.co.shoeisha.javarecipe.chapter03.recipe072;

public final class StaticInitializer {
	private static final int price;

	// staticイニシャライザ
	static {
		int p;
		try {
			p = Integer.parseInt(System.getProperty("price"));
		} catch (Exception e) {
			p = 1000;
		}
		price = p;
	}

	public static void price() {
		System.out.println(price);
	}

}
