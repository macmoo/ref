package jp.co.shoeisha.javarecipe.chapter06.recipe184;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// resolve()メソッドで相対パスを解決する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path1 = Paths.get("C:¥¥temp");
			Path path2 = Paths.get("test.txt");
			
			Path path3 = path1.resolve(path2); // => "C:¥temp¥test.txt"
			System.out.println(path3);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// resolveSibling()メソッドで相対パスを解決する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path1 = Paths.get("C:¥¥temp¥¥test1.txt");
			Path path2 = Paths.get("test2.txt");
			
			Path path3 = path1.resolve(path2); // => "C:¥temp¥test2.txt"
			System.out.println(path3);
		}
		
	}
	
}
