package jp.co.shoeisha.javarecipe.chapter09.recipe268;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoTest {

	@Test
	@Tag("TestInfo-01")
	@DisplayName("テスト01")
	void testInfo01(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
		System.out.println(testInfo.getTags());
	}

	@Test
	@Tag("TestInfo-02")
	@Tag("テスト")
	void testInfo02(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
		System.out.println(testInfo.getTags());
	}

}
