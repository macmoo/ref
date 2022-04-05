package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeViewSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");
		
		// ビューを取得
		DosFileAttributeView view = Files.getFileAttributeView(path, DosFileAttributeView.class);
		/////////////////////////////////////////////////////
		// DOSのファイル属性の取得
		/////////////////////////////////////////////////////
		// ビューから属性クラスを取得
		DosFileAttributes attrs = view.readAttributes();
		// 読み取り専用属性を取得
		boolean isReadOnly = attrs.isReadOnly();
		System.out.println("読み取り専用属性：" + isReadOnly);
		// 隠し属性を取得
		boolean isHidden = attrs.isHidden();
		System.out.println("隠し属性：" + isHidden);
		// システム属性を取得
		boolean isSystem = attrs.isSystem();
		System.out.println("システム属性：" + isSystem);
		// アーカイブ属性を取得
		boolean isArchive = attrs.isArchive();
		System.out.println("アーカイブ属性：" + isArchive);
		
		/////////////////////////////////////////////////////
		// DOSのファイル属性の設定
		/////////////////////////////////////////////////////
		// 読み取り専用属性を設定
		view.setReadOnly(true);
		// 隠し属性を設定
		view.setHidden(true);
		// システム属性を設定
		view.setSystem(true);
		// アーカイブ属性を設定
		view.setArchive(true);
	}
	
}
