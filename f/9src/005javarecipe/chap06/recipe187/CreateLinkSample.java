package jp.co.shoeisha.javarecipe.chapter06.recipe187;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateLinkSample {
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////////////
		// ハードリンクを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe187", "test1.txt");
			Path link = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe187", "link1.txt");
			
			// test1.txtのハードリンクをlink1.txtとして作成
			Files.createLink(link, path);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// シンボリックリンクを作成する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe187", "test2.txt");
			Path link = Paths.get("src", "jp", "co", "shoeisha", "javarecipe", "chapter06", "recipe187", "link2.txt");
			
			// test2.txtのシンボリックリンクをlink2.txtとして作成
			Files.createSymbolicLink(link, path);
		}
	}
	
}
