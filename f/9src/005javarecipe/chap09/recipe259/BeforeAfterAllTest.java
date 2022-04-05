package jp.co.shoeisha.javarecipe.chapter09.recipe259;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAfterAllTest {

	// @BeforeAll,@AfterAllの確認
	@BeforeAll
	static void setUp() {
		System.out.println("----Start----");
	}

	@AfterAll
	static void tearDown() {
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
