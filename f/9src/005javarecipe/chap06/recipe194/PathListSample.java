package jp.co.shoeisha.javarecipe.chapter06.recipe194;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathListSample {

	public static void main(String[] args) throws IOException {
		Path parent = Paths.get(".");

		// parent直下のファイル、ディレクトリの一覧を取得
		try (Stream<Path> children = Files.list(parent)) {
			// 取得したファイル、ディレクトリの絶対パスを表示
			children.forEach(path -> {
				System.out.println(path.toAbsolutePath());
			});
		}

		// ファイル名が.javaで終わるファイルの一覧を取得する
		try (Stream<Path> children = Files.list(parent).filter(
				path -> path.getFileName().endsWith(".java"))) {
			children.forEach(path -> {
				System.out.println(path.toAbsolutePath());
			});
		}
	}

}
