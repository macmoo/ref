package jp.co.shoeisha.javarecipe.chapter09.recipe267;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class FunctionATest {

	@Test
	@Tag("OnlineTest")
	void testA01() {
		System.out.println("OnlineTestタグ");
	}
	@Test
	@Tag("BatchTest")
	void testA02() {
		System.out.println("BatchTestタグ");
	}

	@Test
	@Tag("OnlineTest")
	@Tag("BatchTest")
	void testA03() {
		System.out.println("OnlineTestとBatchTestタグ");
	}

	@Test
	@Tags({
	@Tag("OnlineTest"),
	@Tag("BatchTest")
	})
	void testA04( ) {
		System.out.println("OnlineTestとBatchTestタグ");
	}

}
