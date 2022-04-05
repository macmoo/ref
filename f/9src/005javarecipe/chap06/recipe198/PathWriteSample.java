package jp.co.shoeisha.javarecipe.chapter06.recipe198;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class PathWriteSample {

	public static void main(String[] args) throws IOException {
		// バイト配列をファイルに書き出す
		Path path1 = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe198", "test1.txt");
		byte [ ] bytes = "テスト".getBytes(StandardCharsets.UTF_8);
		Files.write(path1, bytes);
		
		// 文字列をファイルに書き出す
		Path path2 = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe198", "test2.txt");
		List<String> lines = Arrays.asList("1行目", "2行目", "3行目");
		Files.write(path2, lines, StandardCharsets.UTF_8);
		
		// ファイルに追記する
		Files.write(path2, Arrays.asList("4行目"), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
	}
	
}
