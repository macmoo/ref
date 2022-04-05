package jp.co.shoeisha.javarecipe.chapter06.recipe178;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileListSample {
	
	public static void main(String[] args) {
		File dir = new File(".");
		
		/////////////////////////////////////////////////////////////////////////////
		// ディレクトリ内のファイルの一覧を取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			// libディレクトリ内のファイル名の一覧を取得
			String[] fileNames = dir.list();
			for(String fileName: fileNames){
				System.out.println(fileName);
			}
			
			// libディレクトリ内のファイルをFileオブジェクトの配列で取得
			File[] files = dir.listFiles();
			for(File file: files){
				System.out.println(file.getAbsolutePath());
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// FilenameFilterによるフィルタリング
		/////////////////////////////////////////////////////////////////////////////
		{
			String[] fileNames = dir.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// ファイル名の先頭が「.」で始まるファイルは除く
					return !name.startsWith(".");
				}
			});
			
			for(String fileName: fileNames){
				System.out.println(fileName);
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// FileFilterによるフィルタリング
		/////////////////////////////////////////////////////////////////////////////
		{
			File[] files = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					// ファイル以外は除く
					return pathname.isFile();
				}
			});
			
			for(File file: files){
				System.out.println(file.getAbsolutePath());
			}
		}
		
	}

}
