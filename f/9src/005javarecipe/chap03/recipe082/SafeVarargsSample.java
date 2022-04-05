package jp.co.shoeisha.javarecipe.chapter03.recipe082;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsSample {

	public static void main(String[] args) {

		String str = head(
			Arrays.asList("Java", "Scala"),
			Arrays.asList("C", "Ruby")
		);

		System.out.println(str);

	}

	@SafeVarargs
	public static String head(List<String>... elements) {
		if(elements.length == 0 || elements[0].isEmpty()){
			return null;
		}

		return elements[0].get(0);
	}

}
