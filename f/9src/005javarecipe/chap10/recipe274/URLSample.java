package jp.co.shoeisha.javarecipe.chapter10.recipe274;

import java.net.MalformedURLException;
import java.net.URL;

public class URLSample {

	public static void main(String[] args) throws MalformedURLException {
		// URLオブジェクトを生成
		URL url = new URL("http://www.example.com:80/search?q=Java");

		// プロトコルを取得
		String protocol = url.getProtocol(); // => "http"
		System.out.println(protocol);
		
		// ホスト名を取得
		String host = url.getHost(); // => "www.example.com"
		System.out.println(host);
		
		// ポート番号を取得 （URLがポート番号を含まない場合は-1）
		int port = url.getPort(); // => 80
		System.out.println(port);
		
		// ファイル名 （パス＋クエリ文字列）を取得
		String file = url.getFile(); // => "/search?q=Java"
		System.out.println(file);
		
		// パスを取得
		String path = url.getPath(); // => "/search"
		System.out.println(path);
		
		// クエリ文字列を取得 （URLがクエリ文字列を含まない場合はnull）
		String query = url.getQuery(); // => "q=Java"
		System.out.println(query);
	}

}
