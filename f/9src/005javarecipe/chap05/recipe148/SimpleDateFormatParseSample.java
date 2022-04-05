package jp.co.shoeisha.javarecipe.chapter05.recipe148;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatParseSample {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'/'MM'/'dd hh':'mm");
		try {
			// 生成されるDateオブジェクトを出力するとMon Jul 12 00:05:00 JST 2010
			Date date = sdf.parse("2010/07/12 12:05");
			System.out.println(date);
		} catch (ParseException e) {
			// Dateに変換できない文字列が渡された場合発生
			e.printStackTrace();
		}
	}

}
