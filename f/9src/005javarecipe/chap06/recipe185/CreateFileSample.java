package jp.co.shoeisha.javarecipe.chapter06.recipe185;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateFileSample {

	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// 新しいファイルを作成します
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe185", "test1.txt");
			
			// 新しい空のファイルを作成する
			Files.createFile(path);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// パーミッションを指定してファイルを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			Set<PosixFilePermission> permission = PosixFilePermissions.fromString("rwxr-x---");
			FileAttribute<Set<PosixFilePermission>> attribute = PosixFilePermissions.asFileAttribute(permission);
			
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe185", "test2.txt");
			Files.createFile(path, attribute);
		}
	}
	
}
