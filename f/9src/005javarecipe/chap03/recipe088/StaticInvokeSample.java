package jp.co.shoeisha.javarecipe.chapter03.recipe088;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StaticInvokeSample {

	public static void main(String[] args) {

		try {
			// staticメソッド
			Method method = SampleBean.class.getMethod("getMessage", String.class);
			Object methodResult = method.invoke(null, "Takako");
			System.out.println(methodResult);

			// staticフィールド
			Field field = SampleBean.class.getField("MESSAGE");
			Object fieldValue = field.get(null);
			System.out.println(fieldValue);

		} catch (ReflectiveOperationException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 操作対象のクラス
	 */
	public static class SampleBean {
		public static final String MESSAGE = "Hello ";

		public static String getMessage(String name) {
			return MESSAGE + name;
		}
	}

}
