package jp.co.shoeisha.javarecipe.chapter04.recipe120;

import java.util.HashMap;
import java.util.Map;

public class MapPutForJava8Sample {

	// Mapに要素を追加する
	// JDK8以降のみ動作
	public static void main(String[] args) {
		///////////////////////////////////////////////////
		// Mapに要素を追加する
		///////////////////////////////////////////////////
		{
			Map<String, String> map = new HashMap<>();
			map.put("A", "1");

			// すでにキーが登録されている場合は何もしない
			map.putIfAbsent("A", "2");
			System.out.println(map);	// => {A=1}

			// キーが存在しない場合は追加
			map.putIfAbsent("B", "2");
			System.out.println(map);	// => {A=1, B=2}
		}
		///////////////////////////////////////////////////
		// 要素の置換
		///////////////////////////////////////////////////
		{
			Map<String, String> map = new HashMap<>();
			map.put("A", "VB");
			map.put("B", "VBScript");

			// Aの値をJavaで上書き（戻り値は上書き前の値）
			String replaced = map.replace("A", "Java");
			System.out.println(replaced);	// => VB
			System.out.println(map);		// => {A=Java, B=VBScript}

			// Bの値がVBScriptの場合のみJavaScriptで上書き
			// （上書きに成功した場合、戻り値はtrue）
			boolean isReplaced = map.replace("B", "VBScript", "JavaScript");
			System.out.println(isReplaced);	// => true
			System.out.println(map);		// => {A=Java, B=JavaScript}

			// Mapのすべての要素の値を大文字に変換
			map.replaceAll((key, value) -> value.toUpperCase());
			System.out.println(map);		// => {A=JAVA, B=JAVASCRIPT}
		}
		///////////////////////////////////////////////////
		// ラムダ式の戻り値をMapに追加する
		///////////////////////////////////////////////////
		{
			Map<String, String> map = new HashMap<>();
			map.put("A", "1");
			// ラムダ式の戻り値を値としてMapに追加する
			//
			// ラムダ式の引数：
			// key:キー
			// existValue:すでにキーが存在する場合はその値、存在しない場合はnull
			map.compute("B", (key, existValue) -> {
				if (existValue != null) {
					// すでにキーが存在する場合はそのままの値にする
					return existValue;
				} else {
					// キーが存在しない場合は"Nothing"という値を追加
					return "Nothing";
				}
			});

			System.out.println(map);	// => {A=1, B=Nothing}

			// キーが存在しない場合のみラムダ式の戻り値をMapに追加する
			map.computeIfAbsent("B", (key) -> key + " does not exist");	// Bはすでに存在するので追加されない
			map.computeIfAbsent("C", (key) -> key + " does not exist");	// Cは存在しないので追加される

			System.out.println(map);	// => {A=1, B=Nothing, C=C does not exist}

			// キーが存在する場合のみラムダ式の戻り値で値を上書きする
			map.computeIfPresent("B", (key, existValue) -> key + " is " + existValue);	// Bはすでに存在するので値が上書きされる
			System.out.println(map);	// => {A=1, B=B is Nothing, C=C does not exist}
		}
		///////////////////////////////////////////////////
		// 要素のマージ
		///////////////////////////////////////////////////
		{
			Map<String, String> map = new HashMap<>();
			map.put("A", "good");

			// キーが存在するのでラムダ式の結果で値が上書きされる
			map.merge("A", "Java", (oldValue, newValue) -> newValue + " is " + oldValue);

			// キーが存在しないので指定した値（Java）が値としてセットされる
			map.merge("B", "Java", (oldValue, newValue) -> newValue + " is " + oldValue);
			System.out.println(map); // => {A=Java is good, B=Java}
		}
	}

}
