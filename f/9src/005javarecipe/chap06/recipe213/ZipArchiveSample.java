package jp.co.shoeisha.javarecipe.chapter06.recipe213;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipArchiveSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// zipファイルを作成する
		/////////////////////////////////////////////////////////////////////////////
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe213/sample.zip"))) {
			{ 
				// zipファイルにsample.txtを追加
				ZipEntry entry = new ZipEntry("sample.txt");
				zos.putNextEntry(entry);
				byte[] data = Files.readAllBytes(Paths.get(
						"src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe213", "sample.txt"));
				zos.write(data);
				zos.closeEntry();
			}
			{
				// zipファイルにdata/books.csvを追加
				ZipEntry entry = new ZipEntry("data/books.csv");
				zos.putNextEntry(entry);
				byte[] data = Files.readAllBytes(Paths.get(
						"src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe213", "books.csv"));
				zos.write(data);
				zos.closeEntry();
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// zipファイルを展開する
		/////////////////////////////////////////////////////////////////////////////
		try (ZipInputStream zis = new ZipInputStream(new FileInputStream(
				"src/jp/co/shoeisha/javarecipe/chapter06/recipe213/sample.zip"))) {
			
			File outDir = new File("src/jp/co/shoeisha/javarecipe/chapter06/recipe213/unzipped");
			outDir.mkdir();
			
			ZipEntry entry = null;
			while ((entry = zis.getNextEntry()) != null) {
				if (entry.isDirectory()) {
					// ディレクトリの場合
					new File(outDir, entry.getName()).mkdir();
				} else {
					// ファイルの場合
					File file = new File(outDir, entry.getName());
					// 親ディレクトリがなかったら作成
					File parentDir = file.getParentFile();
					if(!parentDir.exists()){
						parentDir.mkdirs();
					}
					// ファイルを作成
					try (FileOutputStream out = new FileOutputStream(file)) {
						byte[] buf = new byte[1024 * 8];
						int length = 0;
						while ((length = zis.read(buf)) != -1) {
							out.write(buf, 0, length);
						}
					}
				}
			}
		}
		
	}

}
