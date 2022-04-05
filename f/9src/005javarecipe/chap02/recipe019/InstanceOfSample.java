package jp.co.shoeisha.javarecipe.chapter02.recipe019;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfSample {

	public static void main(String[] args) {
		Object obj1 = "abc";
		Object obj2 = new ArrayList<>();
		Object obj3 = null;
		// obj1がStringかどうかを調べる
		if (obj1 instanceof String) {
			// obj1がStringの場合のみ実行
			String str = (String) obj1;
			System.out.println(str);
			System.out.println(obj1.getClass().getName());
		}
		// obj2がjava.util.Listかどうかを調べる
		// 実際のオブジェクトはArrayListだが、ArrayListはListの実装クラスなのでtrueになる
		if (obj2 instanceof List) {
			System.out.println(obj2.getClass().getName());
		}
		// obj3はnullなのでfalseを返す
		if (obj3 instanceof Object) {
			System.out.println(obj3.getClass().getName());
		}
	}
}
