package jp.co.shoeisha.javarecipe.chapter06.recipe179;

import java.io.File;
import java.io.IOException;

public class CreateNewFileSample {

	public static void main(String[] args) throws IOException {
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe179/test.txt");
		
		// 空のtest.txtを作成
		if (file.createNewFile()) {
			System.out.println("test.txtを作成しました。");
		} else {
			System.out.println("test.txtはすでに存在します。");
		}
	}

}
