package jp.co.shoeisha.javarecipe.chapter03.recipe090;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class MainSample {

	public static void main(String[] args) throws NoSuchMethodException {

		@SuppressWarnings("rawtypes")
		Class<AnnotationSample> clazz = AnnotationSample.class;

		/////////////////////////////////////////////////////////////////////////////
		// クラスに付与した@Checkを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Check check = clazz.getAnnotation(Check.class);
			System.out.println(check.value());
		}

		/////////////////////////////////////////////////////////////////////////////
		// メソッドに付与した@Checkを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Method method = clazz.getMethod("print", String.class);

			// @Checkが付与されている場合
			if(method.isAnnotationPresent(Check.class)) {
				Check check = method.getAnnotation(Check.class);
				System.out.println(check.value());
			}

			/////////////////////////////////////////////////////////////////////////////
			// 引数に付与した@Checkを取得
			/////////////////////////////////////////////////////////////////////////////
			for(Annotation[] params : method.getParameterAnnotations()) {
				for(Annotation annotation : params) {
					Check check = (Check) annotation;
					System.out.println(check.value());
				}
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		// クラスの型パラメータに付与されたアノテーションを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			TypeVariable<?> t1 = clazz.getTypeParameters()[0];
			String value = t1.getDeclaredAnnotation(Check.class).value();
			System.out.println(value); // => クラスの型パラメータに付与
		}

		/////////////////////////////////////////////////////////////////////////////
		// メソッドの型パラメータに付与されたアノテーションを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Method method = clazz.getMethod("test", Object.class);
			TypeVariable<?> t2 = method.getTypeParameters()[0];
			String value = t2.getDeclaredAnnotation(Check.class).value();
			System.out.println(value); // => メソッドの型パラメータに付与
		}

		/////////////////////////////////////////////////////////////////////////////
		// 継承するクラスに付与されたアノテーションを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			AnnotatedType t1 = clazz.getAnnotatedSuperclass();
			String value = t1.getDeclaredAnnotation(Check.class).value();
			System.out.println(value); // => 親クラスに付与
		}

		/////////////////////////////////////////////////////////////////////////////
		// メソッドの戻り値に付与されたアノテーションを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Method method = clazz.getMethod("hello");
			AnnotatedType t2 = method.getAnnotatedReturnType();
			String value = t2.getDeclaredAnnotation(Check.class).value();
			System.out.println(value); // => 戻り値の型に付与
		}

		/////////////////////////////////////////////////////////////////////////////
		// ElementType.PACKAGE を指定したアノテーションを取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Package p = Package.getPackage("jp.co.shoeisha.javarecipe.chapter03.recipe090");
			Annotation[] a = p.getDeclaredAnnotations();
			String value = ((Check) a[0]).value();
			System.out.println(value);
		}

	}

}
