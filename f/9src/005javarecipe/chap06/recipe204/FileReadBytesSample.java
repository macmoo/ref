package jp.co.shoeisha.javarecipe.chapter06.recipe204;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadBytesSample {

	public static void main(String[] args) throws IOException {
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe204/test.txt"));
		     ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			
			// InputStreamの内容をByteArrayOutputStreamに書き出す
			byte[] buf = new byte[1024 * 8];
			int length = 0;
			while ((length = in.read(buf)) != -1) {
				out.write(buf, 0, length);
			}
			
			// 書き出した内容をバイト配列として取得
			byte[] bytes = out.toByteArray();
			System.out.println(new String(bytes, StandardCharsets.UTF_8));
		}
	}
}
