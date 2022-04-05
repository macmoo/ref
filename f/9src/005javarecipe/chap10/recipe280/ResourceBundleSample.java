package jp.co.shoeisha.javarecipe.chapter10.recipe280;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// デフォルトロケールのリソースバンドルを取得
		/////////////////////////////////////////////////////////////////////////////
		ResourceBundle resources1 = ResourceBundle.getBundle("jp.co.shoeisha.javarecipe.chapter11.recipe295.messages");
		// メッセージの取得
		String value1 = resources1.getString("i18n.hello"); // => "こんにちわ"
		System.out.println(value1);
		/////////////////////////////////////////////////////////////////////////////
		// 英語のリソースバンドルを取得
		/////////////////////////////////////////////////////////////////////////////
		Locale locale = new Locale("en", "US");
		ResourceBundle resources2 = ResourceBundle.getBundle("jp.co.shoeisha.javarecipe.chapter11.recipe295.messages",
				locale);
		// メッセージの取得
		String value2 = resources2.getString("i18n.hello"); // => "hello"
		System.out.println(value2);
	}

}
