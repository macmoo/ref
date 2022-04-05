package jp.co.shoeisha.javarecipe.chapter06.recipe167;

import java.io.File;
import java.io.IOException;

public class CreateFileSample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// Fileオブジェクトを作成する
		/////////////////////////////////////////////////////////////////////////////
		// 絶対パスを指定
		File file1 = new File("C:¥¥Users¥¥takezoe¥¥test.txt");
		
		// カレントディレクトリからの相対パスを指定
		File file2 = new File("test.txt");
		File file3 = new File("..¥¥hoge¥¥test.txt");
		
		// 親ディレクトリと、親ディレクトリからの相対パスを指定
		File parent = new File("C:¥¥Users¥¥takezoe");
		File file4 = new File(parent, "hoge¥¥test.txt");
		
		/////////////////////////////////////////////////////////////////////////////
		// Fileを使用したファイル操作
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリを作成
		File dir = new File("dir");
		dir.mkdir();
		
		// ファイルを作成
		File file = new File(dir, "test.txt");
		file.createNewFile();
		
		// ファイルを削除
		file.delete();
		// ディレクトリを削除
		dir.delete();
	}
	
}
