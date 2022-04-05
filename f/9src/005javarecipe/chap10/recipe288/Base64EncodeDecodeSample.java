package jp.co.shoeisha.javarecipe.chapter10.recipe288;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64EncodeDecodeSample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String target = "Java逆引きレシピ";
		byte[] targetBytes = target.getBytes(StandardCharsets.UTF_8);
		/////////////////////////////////////////////////////////////////////////////
		// Base64エンコード
		/////////////////////////////////////////////////////////////////////////////
		Encoder encoder = Base64.getEncoder();
		byte[] encodedBytes = encoder.encode(targetBytes);
		System.out.println(new String(encodedBytes)); // => エンコードされている
		/////////////////////////////////////////////////////////////////////////////
		// Base64デコード
		/////////////////////////////////////////////////////////////////////////////
		Decoder decoder = Base64.getDecoder();
		byte[] decodedBytes = decoder.decode(encodedBytes);
		// デコードされた文字列を表示
		String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
		System.out.println(decodedString); // => "Java逆引きレシピ"
	}

}
