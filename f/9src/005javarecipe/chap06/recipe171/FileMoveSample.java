package jp.co.shoeisha.javarecipe.chapter06.recipe171;

import java.io.File;
import java.io.IOException;

public class FileMoveSample {
	
	public static void main(String[] args) throws IOException {
		File oldFile = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe171/test.txt");
		
		if(oldFile.createNewFile()){
			System.out.println(oldFile.getName() + "を作成しました。");
		}
		
		File newFile = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe171/readme.txt");
		
		// test.txtをreadme.txtにリネーム
		if(oldFile.renameTo(newFile)){
			System.out.println(oldFile.getName() + "を" + newFile.getName() + "にリネームしました。");
		}
		
		if(newFile.delete()){
			System.out.println(newFile.getName() + "を削除しました。");
		}
	}
	
}
