package jp.co.shoeisha.javarecipe.chapter10.recipe275;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class URLGetSample {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.yahoo.co.jp/");

		// HTTP接続を取得
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// レスポンスコードを取得
		System.out.println(conn.getResponseCode());
		// レスポンスメッセージを取得
		System.out.println(conn.getResponseMessage());
		// レスポンスのコンテンツタイプを取得
		System.out.println(conn.getContentType());
		// レスポンスヘッダをすべて出力
		for (Map.Entry<String, List<String>> header : conn.getHeaderFields().entrySet()) {
			for (String value : header.getValue()) {
				System.out.println(header.getKey() + ": " + value);
			}
		}
		// レスポンスボディを取得
		try (InputStream in = conn.getInputStream();
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			byte[] buf = new byte[1024 * 8];
			int length = 0;
			while ((length = in.read(buf)) != -1) {
				out.write(buf, 0, length);
			}
			System.out.println(new String(out.toByteArray(), StandardCharsets.UTF_8));
		}

		// 切断
		conn.disconnect();
	}

}
