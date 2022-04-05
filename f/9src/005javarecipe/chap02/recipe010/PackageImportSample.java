package jp.co.shoeisha.javarecipe.chapter02.recipe010;

import java.io.*;
import java.util.Date;

import jp.co.shoeisha.javarecipe.chapter02.recipe009.PackageDefinitionSample;

public class PackageImportSample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// インポートしていない場合
		java.util.List<String> list = new java.util.ArrayList<>();
		
		// インポートしている場合
		PackageDefinitionSample sample = new PackageDefinitionSample();
		
		// ワイルドカードを使ったインポート
		File file = new File("sample.xml");
		
		// java.langパッケージはインポート不要
		String s = "文字列";
		Integer i = new Integer(10);
		
		// クラス名が重複する場合
		Date date = new Date(System.currentTimeMillis());
		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
	}
	
}
