package jp.co.shoeisha.javarecipe.chapter09.recipe261;

import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {

	@Test
	void testAssume() {
		// ユーザ名がxxxかどうかを検証
		assumeTrue(System.getProperty("user.name").contains("xxx"));

		// ユーザ名がxxxでない場合、以降のコードは実行せず、
		// テスト自体は成功（スキップ）で続行する
		System.out.println("ユーザ名がxxxのため実行");
	}
}
