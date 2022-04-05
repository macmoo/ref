package jp.co.shoeisha.javarecipe.chapter06.recipe176;

import java.io.File;
import java.io.IOException;

public class FileAbsolutePathSample {
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// ファイルの絶対パスを取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("src");
			System.out.println(file);
			
			// ファイルの絶対パスを取得する
			String absolutePath = file.getAbsolutePath();
			System.out.println(absolutePath);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// ファイルの絶対パスを取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("src");
			System.out.println(file);
			
			// 絶対パスを持つFileオブジェクトに変換する
			File absoluteFile = file.getAbsoluteFile();
			System.out.println(absoluteFile);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// パスを正規化する
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("C:\\Users\\takezoe\\..\\test.txt");
			
			// 正規化したパスを取得
			String path = file.getCanonicalPath(); // => "C:¥Users¥test.txt"
			System.out.println(path);
			
			// 正規化したパスを示すFileオブジェクトを取得
			File normalized = file.getCanonicalFile();
			System.out.println(normalized);
		}
	}
	
}
