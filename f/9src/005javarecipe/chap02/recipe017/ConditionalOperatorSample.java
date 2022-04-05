package jp.co.shoeisha.javarecipe.chapter02.recipe017;

public class ConditionalOperatorSample {

	public static void main(String[] args) {
		int age = 20;
		
		{
			// 三項演算子の場合
			String s = age >= 20 ? "成人" : "未成年";
			System.out.println(s);
		}
		{
			// if文の場合
			String s = null;
			if (age >= 20) {
				s = "成人";
			} else {
				s = "未成年";
			}
			System.out.println(s);
		}
	}
	
}
