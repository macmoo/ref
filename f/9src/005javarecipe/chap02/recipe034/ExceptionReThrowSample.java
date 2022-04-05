package jp.co.shoeisha.javarecipe.chapter02.recipe034;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionReThrowSample {

	/////////////////////////////////////////////////////////////////////////////
	// 例外の再スロー
	/////////////////////////////////////////////////////////////////////////////

	// throwsにParseExceptionとIOExceptionを記述できる
	public void method() throws ParseException, IOException {
		try {
			Date date = new SimpleDateFormat("yyyyMMdd").parse("20141212");
			File file = new File(String.format("test%d.txt", date.getTime()));
			file.createNewFile();

		} catch (Exception e) {
			System.out.println("例外処理を行なう");

			// そのまま再スロー
			throw e;
		}
	}

}
