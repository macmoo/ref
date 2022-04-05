package jp.co.shoeisha.javarecipe.chapter06.recipe182;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAbsoluteSample {

	public static void main(String[] args) {
		// カレントディレクトリからの相対パスを指定
		Path path1 = Paths.get("temp", "test.txt"); // => "temp¥test.txt"
		System.out.println(path1);
		System.out.println(path1.isAbsolute());     // => false
		
		// 絶対パスに変換
		Path path2 = path1.toAbsolutePath();        // => "C:¥Users¥takezoe¥temp¥test.txt"
		System.out.println(path2);
		System.out.println(path2.isAbsolute());     // => true
	}
	
}
