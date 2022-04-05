package jp.co.shoeisha.javarecipe.chapter06.recipe170;

import java.io.File;
import java.io.IOException;

public class FileDeleteSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// ファイルの削除
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe170/test.txt");
	
			if (!file.delete()) {
				System.out.println("ファイルの削除に失敗しました。");
			} else {
				System.out.println("ファイルの削除に成功しました。");
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリの削除
		/////////////////////////////////////////////////////////////////////////////
		{
			// ディレクトリが空ではないので削除に失敗する
			File dir = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe170/foo");
			if(!dir.delete()){
				System.out.println("ディレクトリの削除に失敗しました。");
			}
			
			// 再帰的に削除する
			deleteDirectory(dir);
		}
	}

	/**
	 * ディレクトリを再帰的に削除するメソッド
	 */
	private static void deleteDirectory(File dir) {
		// ディレクトリ内のファイルを削除
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				// ディレクトリの場合は再帰的に削除
				deleteDirectory(file);
			} else {
				// ファイルの場合は削除
				file.delete();
			}
		}
		// ディレクトリを削除
		dir.delete();
	}

}
