package jp.co.shoeisha.javarecipe.chapter03.recipe070;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSample {

	public static void main(String[] args) throws Exception {

		/////////////////////////////////////////////////////////////////////////////
		// オーバーライドしたメソッドを呼び出す
		/////////////////////////////////////////////////////////////////////////////
		SuperClass instance = new SubClass();
		System.out.println(instance.method());

		/////////////////////////////////////////////////////////////////////////////
		// オーバーロードしたメソッドを呼び出す
		/////////////////////////////////////////////////////////////////////////////
		String res1 = format(System.currentTimeMillis());
		String res2 = format(new Date());
		String res3 = format(System.currentTimeMillis(), "yyyy-MM-dd");
		String res4 = format("フォーマット後", System.currentTimeMillis());
		long res5   = format(new Date(), "yyyy-MM-dd");

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
	}

	/////////////////////////////////////////////////////////////////////////////
	// オーバーロード
	/////////////////////////////////////////////////////////////////////////////
	public static String format(long date) {
		return format(new Date(date));
	}

	// オーバーロード（引数の型が異なる）
	public static String format(Date date) {
		return new SimpleDateFormat().format(date);
	}

	// オーバーロード（引数の数が異なる）
	public static String format(long date, String format) {
		return new SimpleDateFormat(format).format(new Date(date));
	}

	// オーバーロード（引数の型や数は同じだが順番が異なる）
	public static String format(String message, long date) {
		return message + ":" + format(date);
	}

	// アクセス修飾子にprivate、戻り値にlong、throwsにExceptionを指定
	private static long format(Date date, String format) throws Exception {
		return new SimpleDateFormat(format)
			.parse(new SimpleDateFormat(format).format(date))
			.getTime();
	}

}
