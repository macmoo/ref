package jp.co.shoeisha.javarecipe.chapter02.recipe047;

public class StringReplaceSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// Stringで置換
		/////////////////////////////////////////////////////////////////////////////
		{
			String source = "Hello World. World is Wonderful.";
			// "World" を "Universe" に置換
			String result = source.replace("World", "Universe"); // => "Hello Universe. Universe is Wonderful."
			System.out.println(result);
		}
		/////////////////////////////////////////////////////////////////////////////
		// Charで置換
		/////////////////////////////////////////////////////////////////////////////
		{
			String source = "Tooth";
			// oをeに置換
			String result = source.replace('o', 'e'); // => "Teeth"
			System.out.println(result);
		}
	}

}
