package jp.co.shoeisha.javarecipe.chapter10.recipe285;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class ProcessBuilderSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		/////////////////////////////////////////////////////////////////////////////
		// コマンドを引数として渡す。Listで渡すことも可能
		/////////////////////////////////////////////////////////////////////////////
		ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir", "/A");
		// 上記と同じ
		//ProcessBuilder processBuilder = new ProcessBuilder(Arrays.asList("cmd", "/c", "dir", "/A"));
		/////////////////////////////////////////////////////////////////////////////
		// 環境変数の操作
		/////////////////////////////////////////////////////////////////////////////
		Map<String, String> environment = processBuilder.environment();
		System.out.println(environment.get("USERNAME"));
		environment.put("HOGE", "foo");
		/////////////////////////////////////////////////////////////////////////////
		// 作業ディレクトリを指定してコマンドを実行
		/////////////////////////////////////////////////////////////////////////////
		Process process = processBuilder.directory(new File("C:\\")).start();
		// 標準入力の取得
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		/////////////////////////////////////////////////////////////////////////////
		// プロセスが終了するまでwait
		/////////////////////////////////////////////////////////////////////////////
		process.waitFor();
		/////////////////////////////////////////////////////////////////////////////
		// プロセスの終了
		/////////////////////////////////////////////////////////////////////////////
		process.destroy();
		/////////////////////////////////////////////////////////////////////////////
		// プロセスの終了コードの取得 0は正常
		/////////////////////////////////////////////////////////////////////////////
		System.out.println(process.exitValue());
	}

}