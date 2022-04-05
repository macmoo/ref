package jp.co.shoeisha.javarecipe.chapter02.recipe029;

import java.util.Arrays;
import java.util.List;

public class ForSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// for文を使った繰り返し処理
		/////////////////////////////////////////////////////////////////////////////
		for(int i = 0; i < 3; i++){
			System.out.println(i + "番目の処理");
		}

		/////////////////////////////////////////////////////////////////////////////
		// Listの要素を順次処理
		/////////////////////////////////////////////////////////////////////////////
		List<String> list = Arrays.asList("Scala", "Java", "Groovy");

		// for文の場合
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

		// 拡張for文の場合
		for(String str : list){
			System.out.println(str);
		}

	}

}
