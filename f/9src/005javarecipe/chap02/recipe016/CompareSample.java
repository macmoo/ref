package jp.co.shoeisha.javarecipe.chapter02.recipe016;

public class CompareSample {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// 基本型の比較
		/////////////////////////////////////////////////////////////////////////////
		int i1 = 123;
		int i2 = 123;
		int i3 = 456;
		if(i1 == i2){
			System.out.println("i1とi2は等しい");
		}
		if(i1 != i3){
			System.out.println("i1とi3は等しくない");
		}
		if(i1 < i3){
			System.out.println("i3はi1より大きい");
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// 文字列の比較
		/////////////////////////////////////////////////////////////////////////////
		String s1 = "123";
		String s2 = new String("123");
		
		// 参照の比較
		if(s1 == s2){
			System.out.println("参照が等しい");
		}
		
		// 値の比較
		if(s1.equals(s2)){
			System.out.println("値が等しい");
		}
		
		// 値の大小を比較
		int result = s1.compareTo(s2);
		if(result == 0){
			System.out.println("値が等しい");
		} else if(result < 0){
			System.out.println("s1はs2より小さい");
		} else if(result > 0){
			System.out.println("s1はs2より大きい");
		}
		
		// 参照型とnullとの比較
		String s = null;
		if(s == null){
			System.out.println("sはnullです。");
		}
		
		s = "";
		if(s != null){
			System.out.println("sはnullではありません。");
		}
	}
	
}
