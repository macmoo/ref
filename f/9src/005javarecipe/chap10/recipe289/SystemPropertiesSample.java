package jp.co.shoeisha.javarecipe.chapter10.recipe289;

import java.util.Properties;

public class SystemPropertiesSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// すべてのシステムプロパティを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Properties p = System.getProperties();
			for (Object key : p.keySet()) {
				System.out.println(key + "=" + p.getProperty((String) key));
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// 個別のシステムプロパティを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			System.setProperty("chapter11.systemprop", "This is sample");
			System.out.println(System.getProperty("chapter11.systemprop"));
		}
	}

}
