package jp.co.shoeisha.javarecipe.chapter09.recipe272;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("jp.co.shoeisha.javarecipe.chapter09")
@ExcludePackages("jp.co.shoeisha.javarecipe.chapter09.recipe254")
public class ExcludePackagesSuites {
// jp.co.shoeisha.javarecipe.chapter09.recipe254配下のテストクラスが実行対象
}