package jp.co.shoeisha.javarecipe.chapter04.recipe108;

import java.util.Comparator;

// 文字列長で比較を行なうComparatorインターフェースの実装
public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// 文字列長を比較する
		return value1.length() - value2.length();
	}

}
