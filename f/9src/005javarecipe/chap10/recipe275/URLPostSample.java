package jp.co.shoeisha.javarecipe.chapter10.recipe275;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLPostSample {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://localhost:8080/test/SampleServlet");

		// HTTP接続を取得
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// リクエストメソッドをPOSTに設定
		conn.setRequestMethod("POST");
		// この接続で出力も行なうように設定
		conn.setDoOutput(true);

		// リクエストパラメータを出力する
		// パラメータはクエリ文字列の形式で指定し、日本語などを送信する場合はURLエンコードする
		try (OutputStream out = conn.getOutputStream()) {
			out.write("id=takezoe".getBytes());
			out.write("&".getBytes());
			out.write(("name=" + URLEncoder.encode("たけぞう", "UTF-8")).getBytes());
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
