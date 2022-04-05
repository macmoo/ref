package jp.co.shoeisha.javarecipe.chapter06.recipe172;

import java.io.File;

public class FileLengthSample {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// ファイルのサイズをバイト単位で取得
		/////////////////////////////////////////////////////////////////////////////
		{
			File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe172/FileLengthSample.java");
			long size = file.length();
			System.out.println(size);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリの場合は0を返す
		/////////////////////////////////////////////////////////////////////////////
		{
			File dir = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe172");
			long size = dir.length();
			System.out.println(size);
		}
	}
	
}
