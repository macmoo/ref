package jp.co.shoeisha.javarecipe.chapter02.recipe020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeConversionSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 基本型の変換（より広い範囲の型への変換）
		/////////////////////////////////////////////////////////////////////////////
		{
			int a = 10;
			// int型はlong型に代入可能
			long b = a;
			System.out.println(b);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 基本型の変換（より狭い範囲の型への変換）
		/////////////////////////////////////////////////////////////////////////////
		{
			long a = 10;
			// long型をint型に代入するにはキャストが必要
			int b = (int) a;
			System.out.println(b);

			double c = 1.5;
			int d = (int) c; // 小数部が切り捨てられ1になる
			System.out.println(d);

			long e = 2147483648l;
			int f = (int) e; // 桁あふれによって-2147483648になる
			System.out.println(f);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 参照型のアップキャスト
		/////////////////////////////////////////////////////////////////////////////
		{
			ArrayList<String> arrayList = new ArrayList<>();

			// ArrayListはListインターフェースを実装しているのでそのまま代入可能
			List<String> list = arrayList;
		}
		/////////////////////////////////////////////////////////////////////////////
		// 参照型のダウンキャスト
		/////////////////////////////////////////////////////////////////////////////
		{
			// List型の変数だが実態はArrayList
			List<String> list = new ArrayList< > ( );

			// ListをArrayListに変換する場合はキャストが必要
			ArrayList<String> arrayList = (ArrayList<String>) list;

			// ArrayListをLinkedListには変換できないのでClassCastExceptionが発生する
			try {
				LinkedList<String> linkedList = (LinkedList<String>) list;
			} catch(ClassCastException ex){
				ex.printStackTrace();
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// Class#cast()メソッドによるキャスト
		/////////////////////////////////////////////////////////////////////////////
		{
			Object obj = Integer.valueOf(1);
			Integer i = Integer.class.cast(obj);
		}

	}

}
