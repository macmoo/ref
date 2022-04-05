package jp.co.shoeisha.javarecipe.chapter10.recipe281;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestSample {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// MD5のMessageDigestの生成
		MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
		// "Java Recipe"文字列のバイトでメッセージダイジェストを更新
		mdMD5.update("Java Recipe".getBytes(StandardCharsets.UTF_8));
		// ハッシュ計算 戻り値はバイト配列
		byte[] md5Hash = mdMD5.digest();
		// バイト配列を16進数の文字列に変換して表示
		StringBuilder hexMD5hash = new StringBuilder();
		for (byte b : md5Hash) {
			String hexString = String.format("%02x", b);
			hexMD5hash.append(hexString);
		}
		System.out.println(hexMD5hash); // => a0d4d746d75071ee04da85b147392608
	}

}
