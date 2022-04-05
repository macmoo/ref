package jp.co.shoeisha.javarecipe.chapter09.recipe255;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertTest {

	// 比較検証
	@Test
	void assertAPI1() {
		int x = 3;

		// xが3であることを検証
		assertEquals(3, x);
		assertEquals(3, x, "xが3でない"); // 値が違う場合はメッセージ表示

		// yが配列{1, 2, 3}であることを検証
		int[] expected = { 1, 2, 3 };
		int[] y = {1, 2, 3};

		assertArrayEquals(expected, y);
		assertArrayEquals(expected, y, "yが配列{1, 2, 3}でない"); // 値が違う場合はメッセージ表示

		// zがList{a, b, c}であることを検証
		List<String> expectedList = Arrays.asList("a", "b", "c");
		List<String> z = Arrays.asList("a", "b", "c");
		assertIterableEquals(expectedList, z); // assertEquals( )でも比較可能だが、値が違う場合のエラー表示が異なる
		assertIterableEquals(expectedList, z, "zがList{a, b, c}でない"); // 値が違う場合はメッセージ表示
	}

	// 真偽の検証
	@Test
	void assertAPI2() {
		boolean x = true;

		// xがtrueであることを検証
		assertTrue(x);
		assertTrue(x, "xがtrueでない"); // 値が違う場合はメッセージ表示

		// falseであることを検証
		assertFalse(x);
		assertFalse(x, "xがfalseでない"); // 値が違う場合はメッセージ表示
	}

	// オブジェクト参照の検証
	@Test
	void assertAPI3() {
		Integer x = new Integer(1);
		Integer expected = new Integer(1);

		// オブジェクトxがオブジェクトexpectedであることを検証
		assertSame(expected, x);
		assertSame(expected, x, "参照先が異なる"); // 値が違う場合はメッセージ表示

		// ２つの引数のオブジェクト参照が異なることを検証
		assertNotSame(expected, x);
		assertNotSame(expected, x, "参照先が同じ"); // 値が違う場合はメッセージ表示
	}

	// nullかどうかの検証
	@Test
	void assertAPI4() {
		String x = null;
		// xがnullであることを検証
		assertNull(x);
		assertNull(x, "xがnullでない"); // 値が違う場合はメッセージ表示
		// nullでないことを検証
		assertNotNull(x);
		assertNotNull(x, "xがnullである"); // 値が違う場合はメッセージ表示
	}

	// 強制的に失敗させる
	@Test
	void assertAPI5() {
		fail();
		fail("ここは通過してはならない");  // 失敗時にエラーメッセージ表示
	}

}
