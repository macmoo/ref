package jp.co.shoeisha.javarecipe.chapter03.recipe091;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeSample {

	public static void main(String[] args) throws Exception {
		/////////////////////////////////////////////////////////////////////////////
		// シリアライズ
		/////////////////////////////////////////////////////////////////////////////

		// ここではファイルに保存する
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialize"))) {
			out.writeObject(new SampleBean());
		}

		/////////////////////////////////////////////////////////////////////////////
		// デシリアライズ
		/////////////////////////////////////////////////////////////////////////////

		// ここではファイルから読み込む
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialize"))) {
			SampleBean bean = (SampleBean) in.readObject();

			System.out.println("id: " + bean.getId());
			System.out.println("name: " + bean.getName());
		}

	}

}
