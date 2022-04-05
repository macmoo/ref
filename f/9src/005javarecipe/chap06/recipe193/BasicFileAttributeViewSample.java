package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeViewSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");
		{
			// ビューを取得
			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			// ビューから属性クラスを取得
			BasicFileAttributes attrs = view.readAttributes();
			// 最終更新日時
			FileTime lastModifiedTime = attrs.lastModifiedTime();
			System.out.println("最終更新日時：" + lastModifiedTime);
			// 最終アクセス日時
			FileTime lastAccessTime = attrs.lastAccessTime();
			System.out.println("最終アクセス日時：" + lastAccessTime);
			// 作成日時
			FileTime creationTime = attrs.creationTime();
			System.out.println("作成日時：" + creationTime);
			// ディレクトリかどうか
			boolean isDirectory = attrs.isDirectory();
			System.out.println("ディレクトリかどうか：" + isDirectory);
			// 通常のファイルかどうか
			boolean isRegularFile = attrs.isRegularFile();
			System.out.println("通常のファイルかどうか：" + isRegularFile);
			// シンボリックリンクかどうか
			boolean isSymbolicLink = attrs.isSymbolicLink();
			System.out.println("シンボリックリンクかどうか：" + isSymbolicLink);
			// ディレクトリ、通常のファイル、シンボリックリンクのいずれにも該当しないか
			boolean isOther = attrs.isOther();
			System.out.println("ディレクトリ、通常のファイル、シンボリックリンクのいずれにも該当しないか：" + isOther);
		}
		{
			// 最終更新日時 （nullの場合は更新しない）
			FileTime lastModifiedTime = FileTime.fromMillis(System.currentTimeMillis());
			// 最終アクセス日時 （nullの場合は更新しない）
			FileTime lastAccessTime = null;
			// 作成日時 （nullの場合は更新しない）
			FileTime creationTime = null;
			
			// ビューを取得してタイムスタンプを設定
			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			view.setTimes(lastModifiedTime, lastAccessTime, creationTime);
		}
	}
	
}
