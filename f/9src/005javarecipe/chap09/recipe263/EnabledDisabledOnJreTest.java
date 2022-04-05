package jp.co.shoeisha.javarecipe.chapter09.recipe263;

import static org.junit.jupiter.api.condition.JRE.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;

public class EnabledDisabledOnJreTest {

	@Test
	@EnabledOnJre(JAVA_8)
	void testOnJava8() {
		// Java 8でのテストを記述する。
		System.out.println("Java8上で動作");
	}

	@Test
	@EnabledOnJre({ JAVA_9, JAVA_10 })
	void testOnJava9Or10() {
		// Java 9と10でのテストを記述する。
		System.out.println("Java9 or 10上で動作");
	}

	@Test
	@DisabledOnJre(JAVA_10)
	void testNotOnJava10() {
		// Java 10以外でのテストを記述する。
		System.out.println("Java10以外で動作");
	}

}
