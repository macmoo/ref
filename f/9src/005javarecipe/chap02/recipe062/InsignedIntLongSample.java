package jp.co.shoeisha.javarecipe.chapter02.recipe062;

public class InsignedIntLongSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// IntやLongを符号なし整数として扱う
		/////////////////////////////////////////////////////////////////////////////
		{
			// intの最大値(2147483647)に対して加算する
			int a = Integer.MAX_VALUE + 1;
			// そのまま表示すると桁あふれを起こし負の数として表示される
			System.out.println(a); // => -2147483648
			// Integer#toUnsignedString()で符号なし整数として表示すると正しい結果が表示される
			System.out.println(Integer.toUnsignedString(a)); // => 2147483648
			// longの最大値(9223372036854775807)に対して加算する
			long b = Long.MAX_VALUE + 1;
			// そのまま表示すると桁あふれを起こし負の数として表示される
			System.out.println(b); // => -9223372036854775808
			// Long#toUnsignedString()で符号なし整数として表示すると正しい結果が表示される
			System.out.println(Long.toUnsignedString(b)); // => 9223372036854775808

			// 符号なしIntegerの除算
			int c = Integer.divideUnsigned(a, 2);
			System.out.println(c);
			// 符号なしIntegerの剰余
			int d = Integer.remainderUnsigned(a, Integer.MAX_VALUE);
			System.out.println(d);
		}
		/////////////////////////////////////////////////////////////////////////////
		// 文字列を符号なし整数に変換
		/////////////////////////////////////////////////////////////////////////////
		{
			// 文字列を符号なし整数としてintに変換
			// Integer.parseInt("2147483648");はNumberFormatException
			int a = Integer.parseUnsignedInt("2147483648");
			System.out.println(a);
			// 文字列を符号なし整数としてlongに変換
			long b = Long.parseUnsignedLong("9999999999999999999");
			System.out.println(b);
			// 負の数を示す文字列を与えると例外が発生する
			try {
				int c = Integer.parseUnsignedInt("-100"); // => NumberFormatException
				System.out.println(c);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}


	}
}
