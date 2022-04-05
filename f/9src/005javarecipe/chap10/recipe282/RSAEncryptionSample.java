package jp.co.shoeisha.javarecipe.chapter10.recipe282;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSAEncryptionSample {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// 暗号化する文字列
		String target = "Java Recipe";
		/////////////////////////////////////////////////////////////////////////////
		// RSAで暗号化
		/////////////////////////////////////////////////////////////////////////////
		// RSAの秘密鍵と公開鍵を生成
		KeyPairGenerator keypairgen = KeyPairGenerator.getInstance("RSA");
		KeyPair keyPair = keypairgen.generateKeyPair();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		// chiperオブジェクトの作成と秘密鍵での初期化
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		// 暗号化完了
		byte[] encryptBytes = cipher.doFinal(target.getBytes());
		System.out.println(new String(encryptBytes)); // => 暗号化されていて読めない
		/////////////////////////////////////////////////////////////////////////////
		// RSAで複合化
		/////////////////////////////////////////////////////////////////////////////
		// 秘密鍵とペアの公開鍵で復号化する
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decriptBytes = cipher.doFinal(encryptBytes);
		System.out.println(new String(decriptBytes)); // => Java Recipe
	}

}
