package jp.co.shoeisha.javarecipe.chapter06.recipe197;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathReadLinesSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe197", "test.txt");
		
		// ファイルの内容を1行ごとの文字列を返すStreamとして取得
		try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
			// 読み込んだファイルの内容をコンソールに出力
			lines.forEach(s -> {
				System.out.println(s);
			});
		}
	}
	
}
