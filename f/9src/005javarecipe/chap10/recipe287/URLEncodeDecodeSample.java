package jp.co.shoeisha.javarecipe.chapter10.recipe287;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeDecodeSample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// エンコードする文字列
		String encodeString = "Java逆引きレシピ";
		/////////////////////////////////////////////////////////////////////////////
		// URLエンコード
		/////////////////////////////////////////////////////////////////////////////
		String encodedString = URLEncoder.encode(encodeString, "UTF-8");
		System.out.println(encodedString);
		// => Java%E9%80%86%E5%BC%95%E3%81%8D%E3%83%AC%E3%82%B7%E3%83%94
		/////////////////////////////////////////////////////////////////////////////
		// URLデコード
		/////////////////////////////////////////////////////////////////////////////
		String decodedString = URLDecoder.decode(encodedString, "UTF-8");
		System.out.println(decodedString); // => Java逆引きレシピ
	}

}
