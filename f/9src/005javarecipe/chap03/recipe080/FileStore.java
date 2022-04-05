package jp.co.shoeisha.javarecipe.chapter03.recipe080;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

// OutputStreamのサブクラス（たとえばFileOutputStream）のみ型パラメータに指定できる
public class FileStore<T extends OutputStream> {

	//「&」でつなげることで複数の上限を指定できる
	private <E extends Serializable & Comparable<E>> int compare(E data1, E data2) {
		// EはComparableのサブクラスだと明白なため、compareToメソッドを呼び出せる
		return data1.compareTo(data2);
	}

	// OK
	public void compareResult() {
		Date date1 = new Date();
		Date date2 = Date.from(
				LocalDateTime.of(2014, 9, 1, 0, 0)
					.atZone(ZoneId.systemDefault())
					.toInstant()
			);

		int i1 = compare(date1, date2);
		System.out.println(i1);
	}

	// コンパイルエラー（ArrayListはComparableを継承していないため）
//	public void compareResult() {
//		ArrayList<String> list1 = new ArrayList<>();
//		ArrayList<String> list2 = new ArrayList<>();
//
//		int i2 = compare(list1, list2);
//		System.out.println(i2);
//	}

}
