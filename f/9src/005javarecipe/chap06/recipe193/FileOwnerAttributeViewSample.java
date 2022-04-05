package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

public class FileOwnerAttributeViewSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");
		
		// ビューを取得
		FileOwnerAttributeView view = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		
		/////////////////////////////////////////////////////
		// ファイル所有者の取得
		/////////////////////////////////////////////////////
		// ファイル所有者のユーザ名を表示
		UserPrincipal owner = view.getOwner();
		System.out.println(owner.getName());
		
		/////////////////////////////////////////////////////
		// ファイル所有者の設定
		/////////////////////////////////////////////////////
		// ユーザを検索
		UserPrincipalLookupService service = FileSystems.getDefault ( ).getUserPrincipalLookupService();
		UserPrincipal user = service.lookupPrincipalByName("takezoe");
		
		// ファイルの所有者を設定
		view.setOwner(user);
	}

}
