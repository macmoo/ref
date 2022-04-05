package jp.co.shoeisha.javarecipe.chapter10.recipe276;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClientSample {

	public static void main(String[] args) throws IOException {
		try (
		  // サーバと通信を行なうためのSocket
		  Socket socket = new Socket("www.yahoo.co.jp", 80);
		  // サーバにデータを送信するためのOutputStream
		  OutputStream out = socket.getOutputStream();
		  // サーバからデータを受信するためのInputStream
		  InputStream in = socket.getInputStream()) {
			
			// サーバにデータを送信
			out.write("GET / HTTP/1.0\n\n".getBytes());
			
			// サーバからデータを受信
			try (ByteArrayOutputStream bytes = new ByteArrayOutputStream()) {
				byte[] buf = new byte[1024 * 8];
				int length = 0;
				while ((length = in.read(buf)) != -1) {
					bytes.write(buf, 0, length);
				}
				
				// サーバから受信したデータをコンソールに表示
				System.out.println(new String(bytes.toByteArray(), "UTF-8"));
			}
		}
	}

}
