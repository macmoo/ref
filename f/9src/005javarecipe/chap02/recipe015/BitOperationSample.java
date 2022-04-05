package jp.co.shoeisha.javarecipe.chapter02.recipe015;

public class BitOperationSample {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// ビット演算
		/////////////////////////////////////////////////////////////////////////////
		{
			// 二進数表記からint型の値を生成
			int a = Integer.parseInt("00000000000000000000000000000100", 2);
			int b = Integer.parseInt("00000000000000000000000000000101", 2);
			
			// AND演算
			int and = a & b;
			// 二進数表記で表示
			System.out.println(Integer.toBinaryString(and)); // => 100
			
			// OR演算
			int or = a | b;
			// 二進数表記で表示
			System.out.println(Integer.toBinaryString(or)); // => 101
			
			// XOR演算
			int xor = a ^ b;
			// 二進数表記で表示
			System.out.println(Integer.toBinaryString(xor)); // =>1
			
			// NOT演算
			int not = ~ a;
			// 二進数表記で表示
			System.out.println(Integer.toBinaryString(not)); // => 11111111111111111111111111111011
		}
		/////////////////////////////////////////////////////////////////////////////
		// シフト演算
		/////////////////////////////////////////////////////////////////////////////
		{
			// 二進数表記からint型の値を生成
			int a = Integer.parseInt("00100000000000000000000000010000", 2);
			
			// 左に2ビットシフト
			int b = a << 2;
			System.out.println(Integer.toBinaryString(b)); // => 10000000000000000000000001000000
			
			// 右に2ビットシフト
			int c = b >> 2;
			System.out.println(Integer.toBinaryString(c)); // => 11100000000000000000000000010000
			
			// さらに右に2ビットシフト
			int d = c >>> 2;
			System.out.println(Integer.toBinaryString(d)); // => 111000000000000000000000000100
		}
	}
	
}
