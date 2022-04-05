package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class PathAttributeSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");
		
		{
			// ビューを取得
			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			
			// ビューから属性クラスを取得
			BasicFileAttributes attrs = view.readAttributes();
			// 属性クラスからファイルの最終更新日時を取得
			FileTime lastModifiedTime = attrs.lastModifiedTime();
			System.out.println("最終更新日時：" + lastModifiedTime);
			
			// ビューを使用してファイルの最終更新日時を設定
			FileTime currentTime = FileTime.fromMillis(System.currentTimeMillis());
			view.setTimes(currentTime, null, null);
		}
		{
			// ビューを介さず属性クラスを直接取得
			@SuppressWarnings("unused")
			BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
			
			// 属性名を文字列で指定して取得
			FileTime lastModifiedTime = (FileTime) Files.getAttribute(path, "basic:lastModifiedTime");
			System.out.println("最終更新日時：" + lastModifiedTime);
		}
	}
	
}
