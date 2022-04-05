package jp.co.shoeisha.javarecipe.chapter06.recipe167;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathSample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// Pathオブジェクトを生成する
		/////////////////////////////////////////////////////////////////////////////
		// デフォルトのファイルシステムを取得
		FileSystem fs = FileSystems.getDefault();
		
		// 絶対パスを指定
		Path path1 = fs.getPath("C:¥¥Users¥¥takezoe¥¥test.txt");
		// パス区切り文字を使用せずにパスを指定
		Path path2 = fs.getPath("C:", "Users", "takezoe", "test.txt");
		// カレントディレクトリからの相対パスを指定
		Path path3 = fs.getPath("dir", "test.txt");
		// Paths#get()メソッドで生成
		Path path4 = Paths.get("dir", "testr.txt");
		
		/////////////////////////////////////////////////////////////////////////////
		// NIO2を使用したファイル操作
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリを作成
		Path dir = Paths.get("dir");
		Files.createDirectory(dir);
		
		// ファイルを作成
		Path file = dir.resolve("test.txt");
		Files.createFile(file);
		
		// ファイルを削除
		Files.delete(file);
		// ディレクトリを削除
		Files.delete(dir);
	}
	
}
