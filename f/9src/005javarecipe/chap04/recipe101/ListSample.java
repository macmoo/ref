package jp.co.shoeisha.javarecipe.chapter04.recipe101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		///////////////////////////////////////////////////
		// Listを生成する
		///////////////////////////////////////////////////
		{
			// Java 6の場合
			List<String> list = new ArrayList<String>();

			// Java 7以降の場合
			List<String> list1 = new ArrayList<>();
		}
		///////////////////////////////////////////////////
		// 要素数を指定してListを生成する
		///////////////////////////////////////////////////
		{
			// ArrayListの生成時に100個分の領域を確保
			List<String> list = new ArrayList<>(100);
		}
	}

	///////////////////////////////////////////////////
	// メソッドの戻り値として空のコレクションを返す場合
	///////////////////////////////////////////////////
	public static List<String> splitByComma(String str) {
		if (str == null || str.length() == 0) {
			// 引数がnullまたは空文字列の場合は空のListを返す
			return Collections.emptyList();
		}
		return Arrays.asList(str.split(","));
	}

}
