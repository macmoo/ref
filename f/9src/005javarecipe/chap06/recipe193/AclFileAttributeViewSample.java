package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;

public class AclFileAttributeViewSample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");

		AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
		
		////////////////////////////////////////////////////////
		// アクセス権限を取得
		////////////////////////////////////////////////////////
		List<AclEntry> acl = view.getAcl();
		
		////////////////////////////////////////////////////////
		// アクセス権限を設定
		////////////////////////////////////////////////////////
		// ユーザを検索
		UserPrincipalLookupService service = FileSystems.getDefault ( ).getUserPrincipalLookupService ();
		UserPrincipal user = service.lookupPrincipalByName("takezoe");
		
		// ユーザに読み取り、書き込みを許可するAclEntryを作成
		AclEntry entry = AclEntry.newBuilder()
			.setType(AclEntryType.ALLOW)
			.setPrincipal(user)
			.setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA)
			.build ();
		
		// 作成したAclEntryをACLの先頭に追加
		acl.add(0, entry);
		
		// アクセス権限を設定
		view.setAcl(acl);
	}
	
}
