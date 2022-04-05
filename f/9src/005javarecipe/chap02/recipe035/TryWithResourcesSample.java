package jp.co.shoeisha.javarecipe.chapter02.recipe035;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResourcesSample {

	public static void main(String[] args) throws IOException {

		/////////////////////////////////////////////////////////////////////////////
		// リソースをクローズする（Java 6）
		/////////////////////////////////////////////////////////////////////////////
		{
			InputStream in = null;

			try {
				in = new FileInputStream("README.txt");

				// FileInputStreamからの読み込み処理

			} finally {
				// FileInputStreamを確実にクローズする
				if(in != null) {
					try {
						in.close();
					} catch(IOException e) {}
				}
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// try-with-resources文を使ってリソースをクローズする（Java 7以降）
		/////////////////////////////////////////////////////////////////////////////
		{
			// 複数宣言する場合はセミコロンで区切る
			// OutputStream → InputStream の順にクローズする
			try(InputStream in = new BufferedInputStream(new FileInputStream("README.txt"));
				OutputStream out = new ByteArrayOutputStream()){

				// InputStreamの内容をByteArrayOutputStreamに書き出す処理

			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// try-with-resources文にcatchとfinallyブロックを定義（Java 7以降）
		/////////////////////////////////////////////////////////////////////////////
		{
			try(InputStream in = new FileInputStream("README.txt")) {

				// FileInputStreamからの読み込み処理

			} catch (IOException e) {
				// tryブロックで発生した例外
				e.printStackTrace();

				// クローズに伴って発生した例外
				for (Throwable t : e.getSuppressed()) {
					t.printStackTrace();
				}

			} finally {
				System.out.println("処理終了");
			}
		}

	}

}
