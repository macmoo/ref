package jp.co.shoeisha.javarecipe.chapter02.recipe060;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandamSample {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		/////////////////////////////////////////////////////////////////////////////
		// Math#randomメソッドを使った乱数生成
		/////////////////////////////////////////////////////////////////////////////
		{
			// 乱数が発生するため、実行ごとに結果は異なる
			double result1 = Math.random();
			System.out.println(result1);
			double result2 = Math.random();
			System.out.println(result2);
		}
		/////////////////////////////////////////////////////////////////////////////
		// SecureRandomを使ったセキュアな乱数生成
		/////////////////////////////////////////////////////////////////////////////
		{
			// nextInt()メソッドでランダムな整数を取得
			Random r1 = new SecureRandom();
			int value1 = r1.nextInt();
			System.out.println(value1);
			int value2 = r1.nextInt();
			System.out.println(value2);
			// アルゴリズムとシードを指定して乱数を生成
			Random r2;
			r2 = SecureRandom.getInstance("SHA1PRNG");
			int value3 = r2.nextInt();
			System.out.println(value3);
			int value4 = r2.nextInt();
			System.out.println(value4);
		}
	}

}
