package jp.co.shoeisha.javarecipe.chapter03.recipe081;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardSample {

	public static void main(String[] args) {

		{
			// raw型で受け取ると警告が出るので、アノテーションで抑制する必要がある
			@SuppressWarnings("rawtypes")
			List list = getList();
			System.out.println(list);
		}

		{
			// ワイルドカードにすることで型があることを保証できる
			List<?> list = getList();
			System.out.println(list);

			// ワイルドカード型のListに値を設定
			replace(list, 1);
			System.out.println(list);
		}

		/////////////////////////////////////////////////////////////////////////////
		// ワイルドカード型の境界
		/////////////////////////////////////////////////////////////////////////////
		{
			// Number型が上限であると保証されるので、Number型で取得できる
			List<? extends Number> list = Arrays.asList(1);
			Number number = list.get(0);
			System.out.println(number);
		}
		{
			// Integer型が下限であると保証されるので、Integer型を設定できる
			Number number = 1;
			List<? super Integer> list = new ArrayList<>(Arrays.asList(number));
			list.add(2);
			System.out.println(list);
		}

	}


	// raw型を返すメソッド
	@SuppressWarnings("rawtypes")
	public static List getList() {
		return Arrays.asList("Java", "Scala");
	}

	/////////////////////////////////////////////////////////////////////////////
	// キャプチャ・ヘルパ
	/////////////////////////////////////////////////////////////////////////////
	public static void replace(List<?> list, int i) {
		replaceHelper(list, i);
	}

	private static <E> void replaceHelper(List<E> list, int i) {
		// Listから取得した値はE型なので、設定できる
		list.set(i, list.get(i - 1));
	}

}
