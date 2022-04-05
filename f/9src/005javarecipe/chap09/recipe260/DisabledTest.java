package jp.co.shoeisha.javarecipe.chapter09.recipe260;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {

	@Disabled("未実装")
	@Test
	void testSum() { // このテストメソッドは実行されない
		assertEquals(3, CalcUtils.sum(1, 2));
	}

}
