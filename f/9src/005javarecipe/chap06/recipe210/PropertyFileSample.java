package jp.co.shoeisha.javarecipe.chapter06.recipe210;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertyFileSample {
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// プロパティファイルの読み込み
		/////////////////////////////////////////////////////////////////////////////
		{
			// プロパティファイルを読み込むための入力ストリームを作成
			try(Reader reader = new InputStreamReader(new FileInputStream(
					"src/jp/co/shoeisha/javarecipe/chapter06/recipe210/sample.properties"), StandardCharsets.UTF_8)){
				// 入力ストリームからロード
				Properties properties = new Properties ( );
				properties.load(reader);
				
				System.out.println("JDBCドライバ=" + properties.getProperty("jdbc.driver"));
				System.out.println("URL=" + properties.getProperty("jdbc.url"));
				System.out.println("ユーザ=" + properties.getProperty("jdbc.user"));
				System.out.println("パスワード=" + properties.getProperty("jdbc.password"));
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// プロパティファイルを保存する
		/////////////////////////////////////////////////////////////////////////////
		{
			// Propertiesオブジェクトにプロパティを設定
			Properties properties = new Properties();
			properties.setProperty("jdbc.driver", "org.h2.Driver");
			properties.setProperty("jdbc.url", "jdbc:h2:mem:mydb;DB_CLOSE_DELAY=-1");
			properties.setProperty("jdbc.user", "ユーザ");
			properties.setProperty("jdbc.password", "password");
			
			// プロパティファイルに保存
			try(Writer writer = new OutputStreamWriter(new FileOutputStream(
					"src/jp/co/shoeisha/javarecipe/chapter06/recipe210/sample2.properties"), StandardCharsets.UTF_8)){
				properties.store(
				writer,                // ファイルに書き込みを行なうためのWriter
				"JDBC Configuration"); // コメント（プロパティファイルの先頭に出力される）
			}
		}
	}
	
}
