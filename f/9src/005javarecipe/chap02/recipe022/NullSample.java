package jp.co.shoeisha.javarecipe.chapter02.recipe022;

public class NullSample {
	
	// 明示的に初期化していないフィールドもnullになる
	private String str;
	
	public static void main(String[] args) {
//		// ローカル変数を初期化していない場合はコンパイルエラーになる
//		String str1;
//		System.out.println(str1);
		
		// 明示的にnullを代入
		String str2 = null;
		System.out.println(str2);
		
		// 明示的に初期化していないフィールドもnullになる
		NullSample sample = new NullSample();
		System.out.println(sample.str);
		
		// nullになる可能性のある変数
		String str3 = sample.str;
		// メソッドを呼び出す前にnullでないことを確認
		if (str3 != null) {
			String upper = str3.toUpperCase();
			System.out.println(upper);
		}
		
		// str3がnullの場合はNullPointerExceptionが発生してしまう
		try {
			if(str3.equals("Java")){
				System.out.println("文字列はJavaです。");
			}
		} catch(NullPointerException ex){
			ex.printStackTrace();
		}
		
		// 比較前にnullチェックを入れる
		if(str3 != null && str3.equals("Java")){
			System.out.println("文字列はJavaです。");
		} else {
			System.out.println("文字列はJavaではありません。");
		}
		
		// 文字列リテラルに対してequals()メソッドを呼び出すようにすることで
		// nullチェックを行わなくてもNullPointerExceptionを回避することができる
		if("Java".equals(str3)){
			System.out.println("文字列はJavaです。");
		} else {
			System.out.println("文字列はJavaではありません。");
		}
	}
	
}
