package jp.co.shoeisha.javarecipe.chapter02.recipe021;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// ラッパークラスで基本型をラップする
		/////////////////////////////////////////////////////////////////////////////
		{
			// 基本型
			int i = 10;

			// ラッパークラスでラップ
			Integer obj = Integer.valueOf(i);

			// ラップしたオブジェクトをListに追加
			List<Integer> list = new ArrayList< > ( );
			list.add(obj);

			// ラッパーから基本型を取り出す
			int i2 = obj.intValue ();
			System.out.println(i2);
		}
		/////////////////////////////////////////////////////////////////////////////
		// オートボクシング、アンボクシング
		/////////////////////////////////////////////////////////////////////////////
		{
			List<Integer> list = new ArrayList< > ( );
			int i1 = 0;

			// 自動的にIntegerにラップして格納される
			list.add(i1);

			// 自動的にIntegerからint値が取り出される
			int i2 = list.get(0);
			System.out.println(i2);
		}
		/////////////////////////////////////////////////////////////////////////////
		// コレクションのremove()メソッド
		/////////////////////////////////////////////////////////////////////////////
		{
			int i = 1;
			List<Integer> list = new ArrayList<>();

			// 値が1の要素を追加
			list.add(i);
			System.out.println(list);

			// 値が1の要素を追加
			list.add(Integer.valueOf(i));
			System.out.println(list);

			// 1番目の要素を削除
			list.remove(i);
			System.out.println(list);

			// 値が1の要素を削除
			list.remove(Integer.valueOf(i));
			System.out.println(list);
		}
	}

}
