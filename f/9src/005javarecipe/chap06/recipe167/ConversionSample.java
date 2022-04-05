package jp.co.shoeisha.javarecipe.chapter06.recipe167;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConversionSample {
	
	public static void main(String[] args) throws IOException {
		// FileをPathに変換
		{
			File file = new File("test.txt");
			Path path = file.toPath();
			System.out.println(path);
		}
		// PathをFileに変換
		{
			Path path = Paths.get("test.txt");
			File file = path.toFile();
			System.out.println(file);
		}
	}

}
