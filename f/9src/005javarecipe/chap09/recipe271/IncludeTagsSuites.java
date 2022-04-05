package jp.co.shoeisha.javarecipe.chapter09.recipe271;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("jp.co.shoeisha.javarecipe.chapter09")
@IncludeTags("OnlineTest")
public class IncludeTagsSuites {
// jp.co.shoeisha.javarecipe.chapter09配下の
// OnlineTestにタグ付けされたテストケースが実行対象
}