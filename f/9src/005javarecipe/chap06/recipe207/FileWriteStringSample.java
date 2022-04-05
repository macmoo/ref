package jp.co.shoeisha.javarecipe.chapter06.recipe207;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileWriteStringSample {
	public static void main(String[] args) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe207/test.txt"), StandardCharsets.UTF_8))) {
			// ファイルに文字列を出力
			writer.write("ファイルに文字列を出力");
			// ファイルに改行を出力
			writer.newLine();
		}
	}
}
