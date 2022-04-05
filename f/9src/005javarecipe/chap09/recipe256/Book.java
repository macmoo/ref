package jp.co.shoeisha.javarecipe.chapter09.recipe256;

public class Book {

	private String name = null;
	private int price;

	public Book(String isbn) {
		// BookクラスはISBNコードを引数に対応する書籍情報を取得するクラス
		// 属性name（書籍名）とprice（税抜き価格）が設定される
		if ("978-4-7981-2541-1".equals(isbn)) {
			this.name = "Scala逆引きレシピ";
			this.price = 3200;
		}
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
