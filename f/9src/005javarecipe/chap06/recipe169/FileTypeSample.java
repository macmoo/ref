package jp.co.shoeisha.javarecipe.chapter06.recipe169;

import java.io.File;

public class FileTypeSample {

	public static void main(String[] args) {
		{
			// ファイルかどうかを調べる
			File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe169/FileTypeSample.java");
			if (file.isFile()) {
				System.out.println(file.getName() + "はファイルです。");
			}
		}
		{
			// ディレクトリかどうかを調べる
			File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe169");
			if (file.isDirectory()) {
				System.out.println(file.getName() + "はディレクトリです。");
			}
		}
	}

}
