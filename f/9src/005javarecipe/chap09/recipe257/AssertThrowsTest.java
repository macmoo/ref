package jp.co.shoeisha.javarecipe.chapter09.recipe257;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertThrowsTest {

	@Test
	void checkExpectedException() {
		// CalcUtils.divide(int x, int y)はx/yの結果をfloatで返すメソッド
		// 引数yが0の場合、IllegalArgumentExceptionをスローする
		assertThrows(IllegalArgumentException.class, () -> CalcUtils.divide(2, 0));

		// 例外の中身を確認する場合
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> CalcUtils.divide(2, 0));
		assertEquals("0で除算", e.getMessage());
	}

}
