package jp.co.shoeisha.javarecipe.chapter02.recipe033;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MultiCatchSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// 複数の例外をマルチキャッチ
		/////////////////////////////////////////////////////////////////////////////

		try {
			Date date = new SimpleDateFormat("yyyyMMdd").parse("20140401");
			new File(String.format("新規ファイル%s.txt", date.getTime())).createNewFile();

		// ParseExceptionまたはIOExceptionが発生した場合
		} catch(ParseException | IOException e) {
			System.out.println("例外発生: " + e.getMessage());
		}

	}

}
