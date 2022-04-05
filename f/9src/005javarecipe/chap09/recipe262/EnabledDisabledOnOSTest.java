package jp.co.shoeisha.javarecipe.chapter09.recipe262;

import static org.junit.jupiter.api.condition.OS.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

public class EnabledDisabledOnOSTest {

	@Test
	@EnabledOnOs(LINUX)
	void testOnLinux( ) {
		// Linuxでのテストを記述する。
		System.out.println("Linux上で動作");
	}

	@Test
	@EnabledOnOs({ LINUX, MAC })
	void testOnLinuxOrMac() {
		// LinuxとMacでのテストを記述する。
		System.out.println("Linux or Mac上で動作");
	}

	@Test
	@DisabledOnOs(WINDOWS)
	void testNotOnWindows() {
		// Windows以外でのテストを記述する。
		System.out.println("Windows以外で動作");
	}

}
