package jp.co.shoeisha.javarecipe.chapter09.recipe266;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName確認用テストクラス")
public class DisplayNameTest {

	@Test
	@DisplayName("テスト01")
	void test01() {
		// 何もしない。
	}
	@Test
	@DisplayName("テスト02")
	void test02() {
		// 何もしない。
	}

}
