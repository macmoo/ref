package jp.co.shoeisha.javarecipe.chapter06.recipe196;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathReadSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe196", "test.txt");

		byte[] bytes = Files.readAllBytes(path);
		System.out.println(new String(bytes, StandardCharsets.UTF_8));

		// ファイルの内容を1行ごとのListとして読み込み
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		// 読み込んだファイルの内容をコンソールに出力
		for (String line : lines) {
			System.out.println(line);
		}
	}

}
