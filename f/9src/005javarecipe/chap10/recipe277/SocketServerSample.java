package jp.co.shoeisha.javarecipe.chapter10.recipe277;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

	public static void main(String[] args) throws IOException {
		// 8080番ポートで待ち受けるサーバソケットを生成
		try (ServerSocket serverSocket = new ServerSocket(8080)) {
			// 無限ループ
			while (true) {
				// クライアントからの接続を待つ
				try (Socket clientSocket = serverSocket.accept();
						OutputStream out = clientSocket.getOutputStream();
						InputStream in = clientSocket.getInputStream()) {
					
					// クライアントにデータを送信
					out.write("HTTP/1.0 200 OK\n".getBytes());
					out.write("Content-Type: text/html\n\n".getBytes());
					out.write("<h1>Hello World!</h1>".getBytes());
				}
			}
		}
	}

}
