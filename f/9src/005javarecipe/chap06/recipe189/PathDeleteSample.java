package jp.co.shoeisha.javarecipe.chapter06.recipe189;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDeleteSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe189", "test.txt");
		
		// test.txtを削除
		Files.delete(path);
	}
	
}
