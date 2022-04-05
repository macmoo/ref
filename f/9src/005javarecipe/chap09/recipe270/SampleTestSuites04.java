package jp.co.shoeisha.javarecipe.chapter09.recipe270;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({jp.co.shoeisha.javarecipe.chapter09.recipe254.StringUtilsTest.class, jp.co.shoeisha.javarecipe.chapter09.recipe255.AssertTest.class})
public class SampleTestSuites04 {
// テストクラスStringUtilsTestとAssertTestが実行対象
}