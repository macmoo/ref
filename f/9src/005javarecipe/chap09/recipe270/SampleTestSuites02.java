package jp.co.shoeisha.javarecipe.chapter09.recipe270;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"jp.co.shoeisha.javarecipe.chapter09.recipe254", "jp.co.shoeisha.javarecipe.chapter09.recipe255"})
public class SampleTestSuites02 {
// jp.co.shoeisha.javarecipe.chapter09.recipe254およびrecipe255配下のテストクラスが実行対象
}