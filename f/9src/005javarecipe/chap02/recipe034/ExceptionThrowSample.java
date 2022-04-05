package jp.co.shoeisha.javarecipe.chapter02.recipe034;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionThrowSample {

	public static void main(String[] args) {

		FileSample sample = new FileSample();

		try {
			sample.createFile();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			sample.createFile("20141212");

		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}

		try {
			sample.createFile("20151212", "--------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static class FileSample {

		/////////////////////////////////////////////////////////////////////////////
		// 例外をスローする
		/////////////////////////////////////////////////////////////////////////////

		// throwsキーワードの後にIOExceptionを記述
		public void createFile() throws IOException {
			File file = new File("test.txt");

			if(file.createNewFile()){
				System.out.println("ファイルを作成しました。");

			} else {
				// ファイルがすでに存在する場合はIOExceptionをスロー
				throw new IOException("ファイルはすでに存在します。");
			}
		}


		/////////////////////////////////////////////////////////////////////////////
		// 複数の例外をスローする
		/////////////////////////////////////////////////////////////////////////////

		// 呼び出し元はParseExceptionもしくはIOExceptionをキャッチする
		public void createFile(String source) throws ParseException, IOException {
			Date date = new SimpleDateFormat("yyyyMMdd").parse(source);
			File file = new File(String.format("test%d.txt", date.getTime()));

			if(file.createNewFile()){
				System.out.println("ファイルを作成しました。");

			} else {
				// ファイルがすでに存在する場合はIOExceptionをスロー
				throw new IOException("ファイルはすでに存在します。");
			}
		}

		// 呼び出し元はExceptionをキャッチする
		public void createFile(String source, String message) throws Exception {
			System.out.println(message);
			createFile(source);
		}

	}

}
