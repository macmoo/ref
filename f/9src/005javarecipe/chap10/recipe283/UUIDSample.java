package jp.co.shoeisha.javarecipe.chapter10.recipe283;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class UUIDSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// UUIDを生成する（バージョン3）
		/////////////////////////////////////////////////////////////////////////////
		{
			// バージョン3のUUIDを生成する
			UUID uuid = UUID.nameUUIDFromBytes("shoeisha.co.jp".getBytes(StandardCharsets.UTF_8));
			// UUIDの文字列表現を取得
			String str = uuid.toString();

			System.out.println(str); // => abf79b46-9dcb-35f4-98f5-ae9f7861eaf2
		}
		/////////////////////////////////////////////////////////////////////////////
		// UUIDを生成する（バージョン4）
		/////////////////////////////////////////////////////////////////////////////
		{
			// バージョン4のUUIDを生成する
			UUID uuid = UUID.randomUUID();
			// UUIDの文字列表現を取得
			String str = uuid.toString();

			System.out.println(str); // => cdbc900b-fdb2-4db9-a40d-a7900362fb28 (実行するたびに変化)
		}
	}

}
