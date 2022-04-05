package jp.co.shoeisha.javarecipe.chapter02.recipe032;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlingSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// 例外処理を行う
		/////////////////////////////////////////////////////////////////////////////

		try {
			new File("test.txt").createNewFile();

		// IOExceptionが発生した場合
		} catch(IOException e) {
			System.out.println("ファイル生成に失敗しました: " + e.getMessage());
		}

		// catchブロックが複数の場合、最初に型が一致した1ブロックのみ実行される
		try {
			new File("xxx/xxx").createNewFile();	// ← IOException発生

			System.out.println("ファイル生成に成功しました");

		} catch(IOException e) {
			System.out.println("IOException発生");	// ← 実行

		} catch(Exception e) {
			System.out.println("Exception発生");	// ← 実行されない
		}

	}

	public void createNewFile() throws IOException {
		// catchブロックを省略した場合、例外はそのままスローされる
		try {
			new File("test.txt").createNewFile();

		} finally {
			System.out.println("ここは必ず実行する");
		}
	}

}
