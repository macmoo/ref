package jp.co.shoeisha.javarecipe.chapter10.recipe282;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptionSample {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		// 暗号化に使う鍵デフォルトだと128bit（16Byte）
		String encryptionKey = "rrrrrrrrrrrrrrrr";
		// 暗号化する文字列
		String target = "Java Recipe";
		/////////////////////////////////////////////////////////////////////////////
		// AESで暗号化
		/////////////////////////////////////////////////////////////////////////////
		// AESのCipherオブジェクトの生成
		Cipher cipher = Cipher.getInstance("AES");
		// 暗号化モードで暗号化に使う鍵で初期化
		SecretKeySpec SKS = new SecretKeySpec(encryptionKey.getBytes(), "AES");
		cipher.init(Cipher.ENCRYPT_MODE, SKS);
		// 暗号化完了
		byte[] encryptBytes = cipher.doFinal(target.getBytes(StandardCharsets.UTF_8));
		System.out.println(new String(encryptBytes)); // => 暗号化されていて読めない
		/////////////////////////////////////////////////////////////////////////////
		// AESで複合化
		/////////////////////////////////////////////////////////////////////////////
		// 同じ鍵で復号化する
		cipher.init(Cipher.DECRYPT_MODE, SKS);
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
		System.out.println(new String(decryptBytes, StandardCharsets.UTF_8)); // => Java Recipe
	}

}
