package jp.co.shoeisha.javarecipe.chapter09.recipe256;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertAllTest {

	// まとめてAssertメソッドを処理する
	@Test
	void assertAllAPI() {
		// BookクラスはISBNコードを引数に対応する書籍情報を取得するクラス
		// 属性name（書籍名）とprice（税抜き価格）が設定される
		Book book = new Book("978-4-7981-2541-1");

		// ISBNコード978-4-7981-2541-1に対応する書籍であるかどうかを確認
		assertAll(
			() -> assertNotNull(book),
			() -> assertEquals("Scala逆引きレシピ", book.getName( )),
			() -> assertEquals(3200, book.getPrice())
		);
	}

}
