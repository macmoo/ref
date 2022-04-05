package jp.co.shoeisha.javarecipe.chapter02.recipe053;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringEncodingSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 文字コードを直接指定してバイト配列を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// Javaで指定できない文字コードを指定するとUnsupportedEncodingExceptionがスローされる
			try {
				byte[] bytes = "こんにちわ 世界".getBytes("UTF8");
				System.out.println(bytes.length);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// Charsetで文字コードを指定してバイト配列を取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Charset cs = Charset.forName("UTF-8");
			byte[] bytes = "こんにちわ 世界".getBytes(cs);
			System.out.println(bytes.length);
		}
		/////////////////////////////////////////////////////////////////////////////
		// StandardCharsets を使う
		/////////////////////////////////////////////////////////////////////////////
		{
			byte[] bytes = "こんにちわ 世界".getBytes(StandardCharsets.UTF_8);
			System.out.println(bytes.length);
		}

	}
}
