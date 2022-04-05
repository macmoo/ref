package jp.co.shoeisha.javarecipe.chapter06.recipe181;

import java.io.File;

public class CreateDirSample {
	
	public static void main(String[] args) {
		// カレントディレクトリにhogeディレクトリを作成する
		File dir1 = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe181/hoge");
		dir1.mkdir();
		
		// カレントディレクトリにhoge/fugaディレクトリを作成する
		File dir2 = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe181/foo/bar");
		dir2.mkdir();
	}

}
