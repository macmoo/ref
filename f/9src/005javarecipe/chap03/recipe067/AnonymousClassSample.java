package jp.co.shoeisha.javarecipe.chapter03.recipe067;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// 匿名クラス
		/////////////////////////////////////////////////////////////////////////////
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		String[] array = {"Scala", "Java", "C", "C++", "Ruby"};

		System.out.println("ソート前: " + Arrays.toString(array));
		Arrays.sort(array, comparator);
		System.out.println("ソート後: " + Arrays.toString(array));
	}

}
