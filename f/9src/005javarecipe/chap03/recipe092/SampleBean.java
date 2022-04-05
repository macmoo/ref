package jp.co.shoeisha.javarecipe.chapter03.recipe092;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SampleBean implements Externalizable {

	/**
	 * @serial ID
	 */
	private int id = 10;

	/**
	 * @serial 名前
	 */
	private String lastName = "多可子";

	/**
	 * シリアライズ対象外
	 */
	private String firstName = "島本";

	/**
	 * シリアライズ処理
	 * @serialData IDと名前をシリアライズする
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 保存するフィールドを指定
		out.writeInt(id + 5);
		out.writeUTF("***" + lastName + "***");
	}

	/**
	 * デシリアライズ処理
	 * @serialData IDと名前をデシリアライズする
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 復元するフィールドを指定
		id = in.readInt();
		lastName = in.readUTF();
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

}
