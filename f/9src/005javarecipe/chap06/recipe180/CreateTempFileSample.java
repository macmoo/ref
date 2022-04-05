package jp.co.shoeisha.javarecipe.chapter06.recipe180;

import java.io.File;
import java.io.IOException;

public class CreateTempFileSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// 一時ファイルを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 一時ファイルを作成
			File file = File.createTempFile("temp", ".txt");
			
			// 作成した一時ファイルのパスを出力
			System.out.println(file.getAbsolutePath());
			
			// 一時ファイルをVMの終了時に削除
			file.deleteOnExit();
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリを指定して一時ファイルを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			// C:¥tempに一時ディレクトリを作成
			File file = File.createTempFile("temp", ".txt", new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe180"));
			
			// 作成した一時ファイルのパスを出力
			System.out.println(file.getAbsolutePath());
			
			// 一時ファイルをVMの終了時に削除
			file.deleteOnExit();
		}
	}

}
