package jp.co.shoeisha.javarecipe.chapter06.recipe212;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockSample {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream out = new FileOutputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe212/test.txt");
		     FileChannel channel = out.getChannel()) {
			
			// ロックを取得
			FileLock lock = channel.lock();
			
			try {
				
				// ... ファイルへの書き込み処理 ...
				
			} finally {
				// ロックは必ず解放する
				lock.release();
			}
		}
	}

}
