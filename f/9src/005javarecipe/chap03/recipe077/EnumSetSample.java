package jp.co.shoeisha.javarecipe.chapter03.recipe077;

import java.util.EnumSet;

public class EnumSetSample {

	public static void main(String[] args) {

		// AとCのフラグを立てる
		EnumSet<Flag> flags = EnumSet.of(Flag.A, Flag.C);

		// Cのフラグが立っているかどうか
		boolean flag = flags.contains(Flag.C);	// => true
		System.out.println(flag);
	}

	// フラグを定義
	enum Flag {A, B, C, D}

}
