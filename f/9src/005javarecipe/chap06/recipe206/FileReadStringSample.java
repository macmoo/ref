package jp.co.shoeisha.javarecipe.chapter06.recipe206;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileReadStringSample {

	public static void main(String[] args) throws IOException {
		
		// ファイルの内容を文字列で読み込む
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe206/test.txt"), StandardCharsets.UTF_8))) {
			String line = null;
			// ファイルの内容を1行ずつ読み込んでコンソールに出力する
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		
		// ファイルから読み込んだバイト配列を文字列に変換する
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe206/test.txt"));
		     ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			// InputStreamの内容をByteArrayOutputStreamに書き出す
			byte[] buf = new byte[1024 * 8];
			int length = 0;
			while ((length = in.read(buf)) != -1) {
				out.write(buf, 0, length);
			}
			byte[] bytes = out.toByteArray();
			// 読み込んだバイト配列を文字列に変換する
			String str = new String(bytes, StandardCharsets.UTF_8);
			System.out.println(str);
		}
	}

}
