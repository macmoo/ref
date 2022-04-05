package jp.co.shoeisha.javarecipe.chapter06.recipe173;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileLastModifiedSample {
	
	public static void main(String[] args) {
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe173/FileLastModifiedSample.java");
		
		// ファイルの最終更新日時をミリ秒で取得
		long time = file.lastModified();
		
		// 取得した最終更新日時をDateオブジェクトに変換
		Date date = new Date(time);
		
		// 取得した最終更新日時をCalendarオブジェクトに変換
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		// ファイルの最終更新日時を現在日時に設定
		file.setLastModified(System.currentTimeMillis());
	}

}
