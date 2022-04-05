package jp.co.shoeisha.javarecipe.chapter10.recipe277;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadSocketServerSample {
	
	public static void main(String[] args) throws IOException {
		// 8080番ポートで待ち受けるサーバソケットを生成
		try (ServerSocket serverSocket = new ServerSocket(8080)) {
			// 無限ループ
			while (true) {
				// クライアントからの接続を受け付ける
				final Socket clientSocket = serverSocket.accept();
				
				// クライアントとの通信を行なうスレッドを生成
				Thread thread = new Thread() {
					@Override
					public void run() {
						// クライアントにデータを送信
						try (OutputStream out = clientSocket.getOutputStream();
								InputStream in = clientSocket.getInputStream()) {
							
							out.write("HTTP/1.0 200 OK\n".getBytes());
							out.write("Content-Type: text/html\n\n".getBytes());
							out.write("<h1>Hello World!</h1>".getBytes());
							
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							// クライアントとの通信を行なうSocketをクローズする
							try {
								clientSocket.close();
							} catch (Exception ex) {
								// Socketクローズ時の例外は無視
							}
						}
					}
				};
				
				// スレッドを開始
				thread.start();
			}
		}
	}
	
}
