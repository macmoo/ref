package jp.co.shoeisha.javarecipe.chapter06.recipe193;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Set;

public class PosixFileAttributeViewSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe193", "test.txt");
		
		// ビューを取得
		PosixFileAttributeView view = Files.getFileAttributeView(path, PosixFileAttributeView.class);
		
		// ビューから属性クラスを取得
		PosixFileAttributes attrs = view.readAttributes();
		
		////////////////////////////////////////////////////////
		// グループを取得
		////////////////////////////////////////////////////////
		GroupPrincipal group = attrs.group();
		System.out.println(group.getName());
		
		////////////////////////////////////////////////////////
		// パーミッションを取得
		////////////////////////////////////////////////////////
		Set<PosixFilePermission> permissions = attrs.permissions();
		// Setにenumが含まれているかどうかでパーミッションを判定できる
		boolean ownerRead     = permissions.contains(PosixFilePermission.OWNER_READ);
		boolean ownerWrite    = permissions.contains(PosixFilePermission.OWNER_WRITE);
		boolean ownerExecute  = permissions.contains(PosixFilePermission.OWNER_EXECUTE);
		boolean groupRead     = permissions.contains(PosixFilePermission.GROUP_READ);
		boolean groupWrite    = permissions.contains(PosixFilePermission.GROUP_WRITE);
		boolean groupExecute  = permissions.contains(PosixFilePermission.GROUP_EXECUTE);
		boolean othersRead    = permissions.contains(PosixFilePermission.OTHERS_READ);
		boolean othersWrite   = permissions.contains(PosixFilePermission.OTHERS_WRITE);
		boolean othersExecute = permissions.contains(PosixFilePermission.OTHERS_EXECUTE);
		System.out.println("OWNER_READ:"     + ownerRead);
		System.out.println("OWNER_WRITE:"    + ownerWrite);
		System.out.println("OWNER_EXECUTE:"  + ownerExecute);
		System.out.println("GROUP_READ:"     + groupRead);
		System.out.println("GROUP_WRITE:"    + groupWrite);
		System.out.println("GROUP_EXECUTE:"  + groupExecute);
		System.out.println("OTHERS_READ"     + othersRead);
		System.out.println("OTHERS_WRITE:"   + othersWrite);
		System.out.println("OTHERS_EXECUTE:" + othersExecute);
		
		////////////////////////////////////////////////////////
		// グループを設定
		////////////////////////////////////////////////////////
		// グループを検索
		UserPrincipalLookupService service = FileSystems.getDefault().getUserPrincipalLookupService();
		GroupPrincipal newGroup = service.lookupPrincipalByGroupName("guest");
		// グループを設定
		view.setGroup(newGroup);
		
		////////////////////////////////////////////////////////
		// パーミッションを設定
		////////////////////////////////////////////////////////
		// 所有者に実行権限を追加
		permissions.add(PosixFilePermission.OWNER_EXECUTE);
		view.setPermissions(permissions);
	}
	
}
