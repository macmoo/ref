package jp.co.shoeisha.javarecipe.chapter06.recipe210;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class XMLPropertyFileSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// XML形式のプロパティファイルを読み込む
		/////////////////////////////////////////////////////////////////////////////
		{
			try (FileInputStream in = new FileInputStream(
					"src/jp/co/shoeisha/javarecipe/chapter06/recipe210/sample.xml")) {
				Properties properties = new Properties();
				properties.loadFromXML(in);
				
				System.out.println("JDBCドライバ=" + properties.getProperty("jdbc.driver"));
				System.out.println("URL=" + properties.getProperty("jdbc.url"));
				System.out.println("ユーザ=" + properties.getProperty("jdbc.user"));
				System.out.println("パスワード=" + properties.getProperty("jdbc.password"));
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// XML形式でプロパティファイルを保存する
		/////////////////////////////////////////////////////////////////////////////
		{
			try (OutputStream out = new FileOutputStream(
					"src/jp/co/shoeisha/javarecipe/chapter06/recipe210/sample2.xml")) {
				Properties properties = new Properties();
				properties.setProperty("jdbc.driver", "org.h2.Driver");
				properties.setProperty("jdbc.url", "jdbc:h2:mem:mydb;DB_CLOSE_DELAY=-1");
				properties.setProperty("jdbc.user", "ユーザ");
				properties.setProperty("jdbc.password", "password");
				
				properties.storeToXML(out, "JDBC Configuration");
			}
		}
	}

}
