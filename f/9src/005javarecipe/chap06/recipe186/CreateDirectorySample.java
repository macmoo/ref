package jp.co.shoeisha.javarecipe.chapter06.recipe186;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectorySample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe186", "hoge");
			
			// hogeディレクトリを作成
			Files.createDirectory(path);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// ネストしたディレクトリを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe186", "foo", "bar");
			
			// hoge/fugaディレクトリを作成
			Files.createDirectories(path);
		}
	}
	
}
