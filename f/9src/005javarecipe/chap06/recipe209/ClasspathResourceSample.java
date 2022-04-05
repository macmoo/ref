package jp.co.shoeisha.javarecipe.chapter06.recipe209;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ClasspathResourceSample {

	public static void main(String[] args) throws IOException {
		try (InputStream in = ClasspathResourceSample.class.getResourceAsStream("test.txt")) {
			if (in == null) {
				// リソースが存在しない場合
				System.out.println("リソースは存在しません。");
			} else {
				// 内容を読み込んで標準出力に表示
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				byte[] buf = new byte[1024 * 8];
				int length = 0;
				while ((length = in.read(buf)) != -1) {
					out.write(buf, 0, length);
				}
				System.out.println(new String(out.toByteArray(), StandardCharsets.UTF_8));
			}
		}
	}
}
