package jp.co.shoeisha.javarecipe.chapter03.recipe092;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class XMLSerializeSample {

	public static void main(String[] args) throws Exception {

		/////////////////////////////////////////////////////////////////////////////
		// XMLへのシリアライズ
		/////////////////////////////////////////////////////////////////////////////
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try(XMLEncoder encoder = new XMLEncoder(out)){
			encoder.writeObject(new Sample("Naoki"));
		}

		// XMLを取得
		String xml = new String(out.toByteArray(), StandardCharsets.UTF_8);

		/////////////////////////////////////////////////////////////////////////////
		// XMLからのデシリアライズ
		/////////////////////////////////////////////////////////////////////////////
		ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
		try(XMLDecoder decoder = new XMLDecoder(in)){
			Sample sample = (Sample) decoder.readObject();

			System.out.println(sample.getMessage());
		}

	}

	public static class Sample {
		private String message;

		// デフォルトコンストラクタは必須
		public Sample() {
			this("Guest");
		}

		public Sample(String name) {
			this.message = "Hello " + name;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}

}
