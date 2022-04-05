package jp.co.shoeisha.javarecipe.chapter09.recipe254;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	void isEmpty01() {
		// 引数がnullの場合、trueが返却されることを確認する
		assertTrue(StringUtils.isEmpty(null));
	}

	@Test
	void isEmpty02() {
		// 引数が空文字の場合、trueが返却されることを確認する
		assertTrue(StringUtils.isEmpty(""));
	}

	@Test
	void isEmpty03() {
		// 引数が任意の文字列の場合、falseが返却されることを確認する
		assertFalse(StringUtils.isEmpty("test"));
	}

}
