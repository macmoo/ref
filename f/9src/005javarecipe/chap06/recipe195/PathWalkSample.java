package jp.co.shoeisha.javarecipe.chapter06.recipe195;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PathWalkSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src");

		// ファイル、ディレクトリのパスを再帰的に表示する
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
			/**
			 * ファイルごとにこのメソッドが呼び出される
			 */
			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
				// ファイルの絶対パスを表示
				System.out.println(file.toAbsolutePath());
				// ファイルの処理を継続
				return FileVisitResult.CONTINUE;
			}
		});
		
		// ファイルが見つかったら処理を終了する
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
				if (file.getFileName().toString().equals("test.txt")) {
					// ファイルが見つかったらそこで処理を終了
					System.out.println("test.txtを見つけました！ ");
					return FileVisitResult.TERMINATE;
				} else {
					// ファイルが見つからない場合は処理を継続
					return FileVisitResult.CONTINUE;
				}
			}
		});
	}

}
