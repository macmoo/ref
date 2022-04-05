package jp.co.shoeisha.javarecipe.chapter06.recipe205;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriteBytesSample {
	
	public static void main(String[] args) throws IOException {
		// ファイルに書き出す内容
		byte[] bytes = "テスト".getBytes(StandardCharsets.UTF_8);
		
		// バイト配列をファイルに書き出す
		try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe205/test.txt"))){
			out.write(bytes);
		}
	}

}
