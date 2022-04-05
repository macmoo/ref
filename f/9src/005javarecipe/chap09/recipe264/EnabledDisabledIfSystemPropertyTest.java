package jp.co.shoeisha.javarecipe.chapter09.recipe264;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class EnabledDisabledIfSystemPropertyTest {

	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	void onlyOn64BitArchitectures() {
		// システム変数os.archが .*64.* の場合のテストを記述する。
		System.out.println("システム変数os.archが .*64.* の場合のテスト");
	}

	@Test
	@DisabledIfSystemProperty(named = "batch-server", matches = "true")
	void testNotOnBatchServer() {
		// システム変数batch-serverがtrueでない場合のテストを記述する。
		System.out.println("システム変数batch-serverがtrueでない場合のテスト");
	}

}
