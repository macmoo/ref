package jp.co.shoeisha.javarecipe.chapter04.recipe112;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////
		// Setを生成する
		/////////////////////////////////////////////
		{
			// Java 6の場合
			Set<String> set = new HashSet<String>();

			// Java 7以降の場合
			Set<String> set1 = new HashSet<>();
		}
		/////////////////////////////////////////////
		// 要素数を指定してSetを生成する
		/////////////////////////////////////////////
		{
			// HashSetの生成時に100個分の領域を確保
			Set<String> set = new HashSet<>(100);
		}
		/////////////////////////////////////////////
		// 順序性の確認
		/////////////////////////////////////////////
		{
			// HashSetの生成
			Set<String> hashSet = new HashSet<>();
			hashSet.add("A");
			hashSet.add("C");
			hashSet.add("E");
			hashSet.add("D");
			hashSet.add("B");
			System.out.println(hashSet);       // => [D, E, A, B, C]　順序性なし

			// LinkedHashSetの生成
			Set<String> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add("A");
			linkedHashSet.add("C");
			linkedHashSet.add("E");
			linkedHashSet.add("D");
			linkedHashSet.add("B");
			System.out.println(linkedHashSet); // => [A, C, E, D, B]　格納順

			// TreeSetの生成
			Set<String> treeSet = new TreeSet<>();
			treeSet.add("A");
			treeSet.add("C");
			treeSet.add("E");
			treeSet.add("D");
			treeSet.add("B");
			System.out.println(treeSet);       // => [A, B, C, D, E]　自然順序付け
		}
	}

}
