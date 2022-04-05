package jp.co.shoeisha.javarecipe.chapter02.recipe031;

import java.util.Arrays;
import java.util.List;

public class BreakContinueSample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Scala", "Java", "Groovy");

		/////////////////////////////////////////////////////////////////////////////
		// breakでループを途中で終了する
		/////////////////////////////////////////////////////////////////////////////

		for(String str : list) {
			// 「Java」が見つかった場合にfor文を抜ける
			if("Java".equals(str)) {
				break;
			}
			System.out.println(str);	// => Scala
		}

		/////////////////////////////////////////////////////////////////////////////
		// continueで処理をスキップする
		/////////////////////////////////////////////////////////////////////////////

		for(String str : list) {
			// 「Java」が見つかった場合はループの先頭に戻り処理を続ける
			if("Java".equals(str)) {
				continue;
			}
			System.out.println(str);	// => Scala、Groovy
		}

		/////////////////////////////////////////////////////////////////////////////
		// ラベルなし
		/////////////////////////////////////////////////////////////////////////////

		for(String str : list) {	//--------------①
			for(int i = 0; i < 2; i++){	//----------②
				if("Java".equals(str)) {
					break;	// ②のループを抜ける。①のループは続行する
				}
				System.out.println(str + i);
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// ラベルあり
		/////////////////////////////////////////////////////////////////////////////

		// 「ラベル名:」でループにラベルを付けておく
		outer:
		for(String str : list) {	//--------------①
			for(int i = 0; i < 2; i++){
				if("Java".equals(str)) {
					// 終了したいループのラベル名を指定する
					break outer;	// ①のループを抜ける
				}
				System.out.println(str + i);
			}
		}

	}

}
