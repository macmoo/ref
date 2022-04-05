package jp.co.shoeisha.javarecipe.chapter06.recipe203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputSample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// ユーザに入力を促すためのメッセージ
		System.out.print("お名前をどうぞ：");
		
		// コンソールからの入力を取得する
		String name = reader.readLine();
		
		// 入力された内容を表示
		System.out.println("こんにちは、" + name + "さん！");
	}
	
}
