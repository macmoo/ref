package jp.co.shoeisha.javarecipe.chapter06.recipe192;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTempFileSample {
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// 一時ファイルを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 一時ファイルを作成
			Path path1 = Files.createTempFile("temp", ".txt");
			// 作成した一時ファイルのパスを出力
			System.out.println(path1.toString());
			
			// ディレクトリを指定して一時ファイルを作成
			Path path2 = Files.createTempFile(Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe192"), "temp", ".txt");
			// 作成した一時ファイルのパスを出力
			System.out.println(path2.toString());
		}
		/////////////////////////////////////////////////////////////////////////////
		// 一時ディレクトリを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 一時ディレクトリを作成
			Path path1 = Files.createTempDirectory("dir");
			// 作成した一時ディレクトリのパスを出力
			System.out.println(path1.toString ( ));
				// => "C:¥Users¥takezoe¥AppData¥Local¥Temp¥dir8007627574342506469"
			
			// ディレクトリを指定して一時ディレクトリを作成
			Path path2 = Files.createTempDirectory(Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe192"), "dir");
			// 作成した一時ディレクトリのパスを出力
			System.out.println(path2.toString ( ));
		}
	}
	
}
