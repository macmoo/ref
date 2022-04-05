package jp.co.shoeisha.javarecipe.chapter07.recipe222;

public class Count {

	private volatile int count;

	public void increment() {
		count++;
	}

	@Override
	public String toString() {
		return "カウント: " + count;
	}

}
