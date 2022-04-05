package jp.co.shoeisha.javarecipe.chapter10.recipe278;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;

public class SocketChannelSample {

	public static void main(String[] args) throws IOException {
		try (SocketChannel socketChannel = SocketChannel
				.open(new InetSocketAddress("www.yahoo.co.jp", 80))) {
			
			// サーバにデータを送信
			ByteBuffer src = ByteBuffer.allocate(1024 * 8);
			src.put("GET / HTTP/1.0\n\n".getBytes());
			src.flip();
			socketChannel.write(src);
			
			// 結果をコンソールに出力するためのChannel
			WritableByteChannel out = Channels.newChannel(System.out);
			
			// サーバから受信したデータをコンソールに出力
			ByteBuffer dest = ByteBuffer.allocate(1024 * 8);
			while (socketChannel.read(dest) != -1) {
				dest.flip();
				out.write(dest);
				dest.clear();
			}
		}
	}

}
