package jp.co.shoeisha.javarecipe.chapter09.recipe273;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("jp.co.shoeisha.javarecipe.chapter09")
@IncludeClassNamePatterns({"^.*Tests?$"})
public class IncludeClassNamePatternsSuites {
// jp.co.shoeisha.javarecipe.chapter09配下のTest/Testsで終わるテストクラスが実行対象
}