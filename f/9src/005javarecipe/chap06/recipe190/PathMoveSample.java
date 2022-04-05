package jp.co.shoeisha.javarecipe.chapter06.recipe190;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMoveSample {
	
	public static void main(String[] args) throws IOException {
		Path from = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe190", "hoge.txt");
		Path to   = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe190", "fuga.txt");
		
		// hoge.txtをfuga.txtに移動
		Files.move(from, to);
		
		// 移動先のファイルを上書きする
		//Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
	}
	
}
