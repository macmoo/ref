package jp.co.shoeisha.javarecipe.chapter03.recipe088;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InvokeSample {

	public static void main(String[] args) {

		SampleBean bean = new SampleBean();

		try {
			// メソッド（引数あり）
			Method addMethod = SampleBean.class.getMethod("add", int.class);
			addMethod.invoke(bean, 100);

			// メソッド（引数なし）
			Method getDataMethod = SampleBean.class.getMethod("getData");
			Object methodResult = getDataMethod.invoke(bean);
			System.out.println(methodResult);

			// フィールド
			Field field = SampleBean.class.getDeclaredField("field");
			field.setAccessible(true);

			field.set(bean, 200);
			Object fieldValue = field.get(bean);
			System.out.println(fieldValue);

		} catch (ReflectiveOperationException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 操作対象のクラス
	 */
	public static class SampleBean {
		private int field;

		public int getData() {
			return field;
		}

		public void add(int add) {
			this.field = add;
		}
	}

}
