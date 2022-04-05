package jp.co.shoeisha.javarecipe.chapter06.recipe208;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileSample {
	
	public static void main(String[] args) throws IOException {
		// 操作対象のファイル
		File file = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe208/test.dat");
		
		try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")){
			// ファイルポインタの位置を先頭から3バイト目に移動
			randomAccessFile.seek(3);
			
			// 3バイト目から1バイト読み込み
			byte b = randomAccessFile.readByte();
			System.out.println((char) b);
			
			// 4バイト目から2バイト読み込み
			byte [ ] bytes = new byte[2];
			randomAccessFile.read(bytes);
			System.out.println(new String(bytes));
			
			// ファイルポインタの位置を先頭から1バイト目に移動
			randomAccessFile.seek(1);
			// 1バイト目から3文字を上書き
			randomAccessFile.write("012".getBytes());
		}
	}

}
