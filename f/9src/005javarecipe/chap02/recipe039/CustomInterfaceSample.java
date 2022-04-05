package jp.co.shoeisha.javarecipe.chapter02.recipe039;

public class CustomInterfaceSample {
	
	@FunctionalInterface
	public interface TriFunction {
		public int apply(int a, int b, int c);
	}
	
	public static void main(String[] args) {
		TriFunction function = (a, b, c) -> a + b + c;
		System.out.println(function.apply(1, 2, 3));
	}
}
