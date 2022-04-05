package jp.co.shoeisha.javarecipe.chapter10.recipe290;

import java.util.Map;

public class SystemGetEnvSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// すべての環境変数を表示する
		/////////////////////////////////////////////////////////////////////////////
		{
			Map<String, String> map = System.getenv();
			for (String key : map.keySet()) {
				System.out.println(key + "=" + map.get(key));
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// 特定の環境変数を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			System.out.println(System.getenv("SystemDrive"));
			System.out.println(System.getenv("USERDOMAIN"));
			System.out.println(System.getenv("windir"));
		}
	}

}
