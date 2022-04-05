package jp.co.shoeisha.javarecipe.chapter06.recipe175;

import java.io.File;
import java.io.IOException;

public class FileSetAttributeSample {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe175/test.txt");
		
		// ファイルを読み取り可能に設定
		file.setReadable(true);
		System.out.println(file.canRead());
		
		// ファイルを書き込み可能に設定
		file.setWritable(true);
		System.out.println(file.canWrite());
		
		// ファイルを実行可能に設定
		file.setExecutable(true);
		System.out.println(file.canExecute());
	}
	
}
