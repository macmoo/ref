package jp.co.shoeisha.javarecipe.chapter09.recipe258;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachTest {

	// @BeforeEach、@AfterEachの確認
	@BeforeEach
	void setUp() {
		System.out.println("----Start----");
	}

	@AfterEach
	void tearDown() {
		System.out.println("-----End-----");
	}

	@Test
	void test1() {
		System.out.println("test1()の実行");
	}

	@Test
	void test2() {
		System.out.println("test2()の実行");
	}

}
