package jp.co.shoeisha.javarecipe.chapter02.recipe038;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceSample {

	public static void main(String[] args){
		
		/////////////////////////////////////////////////////////////////////////////
		// Functionインターフェースを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// 文字列を引数に取りjava.util.Dateに変換して返す関数
			Function<String, Date> toDate = s -> {
				try {
					return new SimpleDateFormat("yyyy/MM/dd").parse(s);
				} catch(ParseException ex){
					return null;
				}
			};
			
			// 関数を直接呼び出す場合はapply ( )メソッドを使用する
			Date date = toDate.apply("2014/09/28");
			System.out.println(date);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// UnaryOperatorインターフェースを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// 文字列を大文字に変換する関数
			UnaryOperator<String> toUpper = s -> s.toUpperCase ();
			
			// 関数を直接呼び出す場合はapply()メソッドを使用する
			String s = toUpper.apply("java");
			System.out.println(s);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Consumerインターフェースを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// java.util.Dateを文字列にフォーマットして出力する関数
			Consumer<Date> print = date -> {
				String s = new SimpleDateFormat("yyyy/MM/dd").format(date);
				System.out.println(s);
			};
			
			// 関数を直接呼び出す場合はaccept ( )メソッドを使用する
			print.accept(new Date ( ));
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Predicateインターフェースを使う
		/////////////////////////////////////////////////////////////////////////////
		{
			// 文字列が"Java"で始まるかどうかを調べる関数
			Predicate<String> condition = s -> s.startsWith("Java");
			
			// 関数を直接呼び出す場合はtest ( )メソッドを使用する
			boolean result = condition.test("JavaScript");
			System.out.println(result);
		}
	}
	
}
