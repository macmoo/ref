package jp.co.shoeisha.javarecipe.chapter06.recipe174;

import java.io.File;
import java.io.IOException;

public class FileGetAttributeSample {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe174/test.txt");
		
		// ファイルが読み取り可能かどうかを取得
		boolean canRead = file.canRead();
		System.out.println("読み取り可能：" + canRead);
		
		// ファイルが書き込み可能かどうかを取得
		boolean canWrite = file.canWrite ( );
		System.out.println("書き込み可能：" + canWrite);
		
		// ファイルが実行可能かどうかを取得
		boolean canExecute = file.canExecute ( );
		System.out.println("実行可能：" + canExecute);
		
		// ファイルが隠しファイルかどうかを取得
		boolean isHidden = file.isHidden ( );
		System.out.println("隠しファイルかどうか：" + isHidden);
	}
	
}
