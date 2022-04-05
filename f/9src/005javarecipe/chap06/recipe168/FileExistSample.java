package jp.co.shoeisha.javarecipe.chapter06.recipe168;

import java.io.File;

public class FileExistSample {

	public static void main(String[] args) {
		// ファイルが存在するかどうか調べる
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe168/FileExistSample.java");
		if(file.exists()){
			System.out.println("ファイルは存在します。");
		} else {
			System.out.println("ファイルは存在しません。");
		}
	}

}
