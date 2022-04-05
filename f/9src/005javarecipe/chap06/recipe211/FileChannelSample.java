package jp.co.shoeisha.javarecipe.chapter06.recipe211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;

public class FileChannelSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// FileChannelでファイルの内容を読み込む
		/////////////////////////////////////////////////////////////////////////////
		try (FileInputStream in = new FileInputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe211/test.txt");
		     FileChannel channel = in.getChannel()) {

			// バッファのサイズ
			int bufferSize = 1024 * 8;

			// バッファを作成
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

			// コンソールに出力するためのチャネル
			WritableByteChannel out = Channels.newChannel(System.out);

			// チャネルからファイルの内容を読み込み
			while (channel.read(buffer) != -1) {
				// バッファのリミットを読み込んだ位置に設定し、ポジションを先頭に戻す
				buffer.flip();

				// バッファの内容をコンソールに出力
				out.write(buffer);

				// バッファをクリア
				buffer.clear();
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// FileChannelでファイルに出力する
		/////////////////////////////////////////////////////////////////////////////
		try (FileOutputStream out = new FileOutputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe211/out.txt");
		     FileChannel channel = out.getChannel()) {

			// バッファのサイズ
			int bufferSize = 1024 * 8;

			// バッファを作成
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

			// バッファの内容を設定
			buffer.put("あいうえお".getBytes(StandardCharsets.UTF_8));

			// バッファのリミットを読み込んだ位置に設定し、ポジションを先頭に戻す
			buffer.flip();

			// チャネルにバッファの内容を書き出す
			channel.write(buffer);
		}


		/////////////////////////////////////////////////////////////////////////////
		// ファイルへの入出力が可能なFileChannel
		/////////////////////////////////////////////////////////////////////////////
		try (RandomAccessFile file = new RandomAccessFile(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe211/out.txt", "rw");
		     FileChannel channel = file.getChannel()) {

			// チャネルの読み書きに使用するバッファを作成
			int bufferSize = 1024 * 8;
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

			// チャネルへの書き込み
			buffer.put("123".getBytes());
			buffer.flip();
			channel.write(buffer);

			// チャネルのポジションを先頭に戻し、バッファをクリア
			channel.position(0);
			buffer.clear();

			// チャネルからの読み込み
			WritableByteChannel out = Channels.newChannel(System.out);
			while (channel.read(buffer) != -1) {
				buffer.flip();
				out.write(buffer);
				buffer.clear();
			}
		}

	}

}
