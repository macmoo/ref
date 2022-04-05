package jp.co.shoeisha.javarecipe.chapter02.recipe036;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StackTraceSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// 例外からスタックトレース情報を取得
		/////////////////////////////////////////////////////////////////////////////
		try {
			Date date = new SimpleDateFormat("yyyyMMdd").parse("aaa");
			System.out.println(date.toString());

		} catch (Exception e) {
			for(StackTraceElement element : e.getStackTrace()) {
				String className  = element.getClassName();		// クラス名（完全修飾名）
				String methodName = element.getMethodName();	// メソッド名
				String fileName   = element.getFileName();		// ファイル名
				int lineNumber    = element.getLineNumber();	// 行番号

				System.out.println(String.format("%s.%s(%s:%d)", className, methodName, fileName, lineNumber));
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// スレッドからスタックトレース情報を取得
		/////////////////////////////////////////////////////////////////////////////

		// 現在実行中のスレッドのスタックトレース
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		for(StackTraceElement element : elements) {
			String className  = element.getClassName();
			String methodName = element.getMethodName();
			String fileName   = element.getFileName();
			int lineNumber    = element.getLineNumber();

			System.out.println(String.format("%s.%s(%s:%d)", className, methodName, fileName, lineNumber));
		}

	}

}
