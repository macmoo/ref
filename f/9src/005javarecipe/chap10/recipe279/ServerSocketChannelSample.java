package jp.co.shoeisha.javarecipe.chapter10.recipe279;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class ServerSocketChannelSample {

	public static void main(String[] args) throws IOException {
		try (ServerSocketChannel serverSocketChannel = ServerSocketChannel
				.open()) {
			// 8080番ポートで待ち受け
			serverSocketChannel.bind(new InetSocketAddress(8080));
			
			// ノンブロッキングモードを有効にする
			serverSocketChannel.configureBlocking(false);
			
			// クライアントからの接続を監視
			Selector selector = Selector.open();
			serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
			
			// 入出力操作を監視
			while (selector.select() > 0) {
				Iterator<SelectionKey> it = selector.selectedKeys().iterator();
				while (it.hasNext()) {
					SelectionKey key = it.next();
					it.remove();
					
					// クライアントからの接続を受け付ける
					if (key.isAcceptable()) {
						// クライアントへのデータ送信を監視
						ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
						SocketChannel channel = serverChannel.accept();
						channel.configureBlocking(false);
						channel.register(selector, SelectionKey.OP_WRITE);
						
					// クライアントにデータを送信する
					} else if (key.isWritable()) {
						try (SocketChannel channel = (SocketChannel) key.channel()) {
							ByteBuffer buffer = ByteBuffer.allocate(1024 * 8);
							buffer.put("HTTP/1.0 200 OK\n".getBytes());
							buffer.put("Content-Type: text/html\n\n".getBytes());
							buffer.put("<h1>Hello World!</h1>".getBytes());
							buffer.flip();
							
							channel.write(buffer);
						}
					}
				}
			}
		}
	}

}
