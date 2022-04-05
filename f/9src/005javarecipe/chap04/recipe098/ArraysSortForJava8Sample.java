package jp.co.shoeisha.javarecipe.chapter04.recipe098;

import java.util.Arrays;

public class ArraysSortForJava8Sample {

	// 並列ソート
	// JDK8以降のみ動作
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 4, 3};
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
	}

}
