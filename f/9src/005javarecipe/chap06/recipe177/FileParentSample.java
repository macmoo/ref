package jp.co.shoeisha.javarecipe.chapter06.recipe177;

import java.io.File;

public class FileParentSample {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 親ディレクトリを取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("C:\\Users\\takezoe\\test.txt");
			
			// 親ディレクトリ名を取得
			String parentDirName = file.getParent(); // => "C:¥Users¥takezoe"
			System.out.println(parentDirName);
			
			// 親ディレクトリを表すFileオブジェクトを取得
			File parentDir = file.getParentFile(); // => "C:¥Users¥takezoe"
			System.out.println(parentDir);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// パスから親ディレクトリを取得できない場合
		/////////////////////////////////////////////////////////////////////////////
		{
			// Fileのパスから親ディレクトリを取得できない場合
			File dir = new File("lib");
			File parentDir = dir.getParentFile ( ); // => null
			System.out.println(parentDir);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// 一度絶対パスに変換してから親ディレクトリを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// カレントディレクトリが "C:¥Users¥takezoe" の場合
			File dir = new File("lib"); // => "lib"
			// 絶対パスに変換
			File absoluteDir = dir.getAbsoluteFile(); // => "C:¥Users¥takezoe¥lib"
			System.out.println(absoluteDir);
			// 親ディレクトリを取得
			File parentDir = absoluteDir.getParentFile(); // => "C:¥Users¥takezoe"
			System.out.println(parentDir);
		}
	}
	
}
