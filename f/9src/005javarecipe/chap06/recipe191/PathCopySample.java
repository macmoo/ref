package jp.co.shoeisha.javarecipe.chapter06.recipe191;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathCopySample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// Pathのコピー
		/////////////////////////////////////////////////////////////////////////////
		{
			Path from = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe191", "hoge.txt");
			Path to   = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe191", "fuga1.txt");
			
			// hoge.txtをfuga.txtに移動
			Files.copy(from, to);
			
			// 移動先のファイルを上書きする
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
			
			// 複数のオプションを指定
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Streamのコピー
		/////////////////////////////////////////////////////////////////////////////
		{
			// InputStreamをPathで指定したファイルへコピー
			try (InputStream in = new FileInputStream("src/jp/co/shoeisha/javarecipe/chapter06/recipe191/hoge.txt")) {
				Path path = Paths.get("src/jp/co/shoeisha/javarecipe/chapter06/recipe191/fuga2.txt");
				long size = Files.copy(in, path);
				System.out.println(size + "バイトをコピーしました。");
			}
			// Pathで指定したファイルをOutputStreamへコピー
			try (OutputStream out = new FileOutputStream("src/jp/co/shoeisha/javarecipe/chapter06/recipe191/fuga3.txt")) {
				Path path = Paths.get("src/jp/co/shoeisha/javarecipe/chapter06/recipe191/hoge.txt");
				long size = Files.copy(path, out);
				System.out.println(size + "バイトをコピーしました。");
			}			
		}
	}
	
}
