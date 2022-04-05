package jp.co.shoeisha.javarecipe.chapter06.recipe188;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExistSample {
	
	public static void main(String[] args) {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe188", "PathExistSample.java");
		
		// パスが存在することを調べる
		if(Files.exists(path)){
			System.out.println("パスは存在します。");
		}
		
		// パスが存在しないことを調べる
		if(Files.notExists(path)){
			System.out.println("パスは存在しません。");
		}
		
		// シンボリックリンクは辿らない
		if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
			System.out.println("パスは存在します。");
		}
	}
	
}
