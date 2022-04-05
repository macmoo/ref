package jp.co.shoeisha.javarecipe.chapter02.recipe023;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) throws Exception {
		/////////////////////////////////////////////////////////////////////////////
		// Optionalを生成する
		/////////////////////////////////////////////////////////////////////////////
		
		// 値を持つOptionalオブジェクト（of ( )メソッドにはnullを渡すと例外がスローされる）
		Optional<String> exist = Optional.of("123");
		System.out.println(exist);

		// 値を持たない空のOptionalオブジェクト
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// 値がnull以外の場合は値を持つOptional、nullの場合は空のOptionalを生成する
		{
			String value = "abc";
			Optional<String> optional = Optional.ofNullable(value);
			System.out.println(optional);
		}
		{
			String value = null;
			Optional<String> optional = Optional.ofNullable(value);
			System.out.println(optional);
		}

		/////////////////////////////////////////////////////////////////////////////
		// Optionalから値を取得する
		/////////////////////////////////////////////////////////////////////////////
		{
			Optional<String> optional = Optional.of("abc");
			
			// 値が存在しない場合はNoSuchElementExceptionがスローされる
			String value1 = optional.get();
			System.out.println(value1);
			
			// 値が存在しない場合は空文字列を返す
			String value2 = optional.orElse("");
			System.out.println(value2);
			
			// 値が存在しない場合はラムダ式の結果を返す
			String value3 = optional.orElseGet(() -> {
				return new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date());
			});
			System.out.println(value3);
			
			// 値が存在しない場合は例外をスローする
			String value4 = optional.orElseThrow(() -> new Exception("値がありません"));
			System.out.println(value4);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Optionalが値を持つ場合のみ処理を行う
		/////////////////////////////////////////////////////////////////////////////
		{
			Optional<String> optional = Optional.of("abc");
			
			// 値が存在するかどうかを判定して処理を行なう
			if (optional.isPresent()) {
				System.out.println(optional.get());
			}
			// 値がある場合だけラムダ式の処理を行なう
			optional.ifPresent(s -> {
				System.out.println(s);
			});
			
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Optionalの値が条件を満たす場合のみ処理を行なう
		/////////////////////////////////////////////////////////////////////////////
		{
			// Optionalを生成
			String value = "1234567890";
			Optional<String> optional = Optional.ofNullable(value);
			
			// 値の長さが10文字以上の場合のみ処理を行なう
			optional.filter(s -> s.length() >= 10).ifPresent(s -> {
				System.out.println(s);
			});
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// Optionalの値を変換する
		/////////////////////////////////////////////////////////////////////////////
		{
			// Optionalを生成
			String value = "abc";
			Optional<String> optional = Optional.ofNullable(value);
			
			// Optionalに格納されている値を大文字に変換
			Optional<String> mapped = optional.map(s -> s.toUpperCase());
			System.out.println(mapped);
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// 複数のOptionalに対して処理を行なう
		/////////////////////////////////////////////////////////////////////////////
		// TODO 執筆時点でのEclipseだとコンパイルエラーになってしまう
//		{
//			Optional<String> userName = Optional.of("sa");
//			Optional<String> password = Optional.of("sa");
//			
//			boolean isValid = userName.flatMap(u -> {
//				return password.map(p -> {
//					return u.equals("sa") && p.equals("sa");
//				});
//			}).orElse(false);
//			
//			System.out.println(isValid);
//		}
	}
}
