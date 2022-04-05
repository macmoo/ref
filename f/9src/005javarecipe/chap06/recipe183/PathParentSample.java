package jp.co.shoeisha.javarecipe.chapter06.recipe183;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathParentSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 親ディレクトリのパスを取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			Path path1 = Paths.get("temp", "test.txt"); // => "temp¥test.txt"
			
			// 親ディレクトリのパスを取得
			Path parent1 = path1.getParent(); // => "temp"
			System.out.println(parent1);
			
			// 親ディレクトリのパスが取得できない場合
			Path path2 = Paths.get("test.txt"); // => "test.txt"
			Path parent2 = path2.getParent(); // => null
			System.out.println(parent2);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// パスのルートコンポーネントを取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			// ルートコンポーネントを持つパスの場合
			Path path1 = Paths.get("C:", "temp", "test.txt"); // => "C:¥temp¥test.txt"
			Path root1 = path1.getRoot(); // => "C:¥"
			System.out.println(root1);
			
			// ルートコンポーネントを持たないパスの場合
			Path path2 = Paths.get("temp", "test.txt"); // => "temp¥test.txt"
			Path root2 = path2.getRoot(); // => null
			System.out.println(root2);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Pathを正規化する
		/////////////////////////////////////////////////////////////////////////////
		{
			// 冗長なパス
			Path path = Paths.get("C:", ".", "temp", "..", "etc"); // => C:¥.¥temp¥..¥etc
			
			// パスを正規化
			Path normalizedPath = path.normalize ( ); // => C:¥etc
			System.out.println(normalizedPath);
		}
		
	}
	
}
