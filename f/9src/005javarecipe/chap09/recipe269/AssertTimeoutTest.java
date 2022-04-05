package jp.co.shoeisha.javarecipe.chapter09.recipe269;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class AssertTimeoutTest {

	@Test
	void testTimeout( ) {
		assertTimeout(Duration.ofSeconds(2), ()-> Thread.sleep(1000L));
	}
	@Test
	void testTimeoutPreemptively() {
		// 2秒を超えるとAssertionFailedErrorになる。
		assertTimeoutPreemptively(Duration.ofSeconds(2), ( )-> Thread.sleep(3000L));
	}

}
