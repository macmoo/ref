package jp.co.shoeisha.javarecipe.chapter09.recipe265;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnabledDisabledIfEnvironmentVariableTest {

	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = "Production")
	void testOnProductionEnv() {
		// 環境変数ENVがProductionの場合のテストを記述する。
		System.out.println("環境変数ENVがProductionの場合のテスト");
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = "Dev-*")
	void testNotOnDevelopmentEnv() {
		// 環境変数ENVがDev-*でない場合のテストを記述する。
		System.out.println("環境変数ENVがDev-*でない場合のテスト");
	}

}
