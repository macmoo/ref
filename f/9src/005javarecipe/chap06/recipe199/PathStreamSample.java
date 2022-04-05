package jp.co.shoeisha.javarecipe.chapter06.recipe199;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathStreamSample {
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// PathからInputStreamを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe199", "in.txt");
			
			// InputStreamを取得
			InputStream in = Files.newInputStream(path);
			in.close();
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// PathからOutputStreamを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe199", "out.txt");
			
			// OutputStreamを取得
			OutputStream out = Files.newOutputStream(path);
			
//			// すでに存在するファイルを追記モードでオープン
//			OutputStream out = Files.newOutputStream(path, APPEND);
//			
//			// ファイル （存在しない場合は新規作成）を追記モードでオープン
//			OutputStream out = Files.newOutputStream(path, CREATE, APPEND);
//			
//			// ファイルを作成し書き込みモードでオープン （すでにファイルが存在する場合は例外をスロー）
//			OutputStream out = Files.newOutputStream(path, CREATE_NEW);
			
			out.close();
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// PathからChannelを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe199", "out.txt");
			
			// ByteChannelを取得
			ByteChannel channel = Files.newByteChannel(path);
			channel.close();
		}
	}
	
}
