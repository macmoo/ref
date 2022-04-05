
package jp.co.shoeisha.javarecipe.chapter03.recipe086;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MemberSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// publicコンストラクタを取得
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicコンストラクタ **********");
		for (Constructor<?> constructor : File.class.getConstructors()) {
			// コンストラクタ名
			String name = constructor.getName();

			// 引数の型
			Class<?>[] type = constructor.getParameterTypes();

			// 修飾子がpublicかどうか
			boolean mod = Modifier.isPublic(constructor.getModifiers());

			System.out.print(name);
			System.out.print(Arrays.toString(type));
			System.out.println("isPublic: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// publicメソッドを取得（スーパークラスも含む）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicメソッド **********");
		for (Method method : File.class.getMethods()) {
			// メソッド名
			String name = method.getName();

			// 戻り値の型
			Class<?> type = method.getReturnType();

			// 引数の型
			Class<?>[] params = method.getParameterTypes();

			// 修飾子がstaticかどうか
			boolean mod = Modifier.isStatic(method.getModifiers());

			System.out.print(type + " ");
			System.out.print(name);
			System.out.print(Arrays.toString(params));
			System.out.println("isStatic: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// publicフィールドを取得（スーパークラスも含む）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicフィールド **********");
		for (Field field : File.class.getFields()) {
			// フィールド名
			String name = field.getName();

			// フィールドの型
			Class<?> type = field.getType();

			// 修飾子がfinalかどうか
			boolean mod = Modifier.isFinal(field.getModifiers());

			System.out.print(type + " ");
			System.out.print(name + " ");
			System.out.println("isFinal: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// 全コンストラクタを取得
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateコンストラクタ **********");
		for (Constructor<?> constructor : File.class.getDeclaredConstructors()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(constructor.getModifiers())) {
				System.out.println(Arrays.toString(constructor.getParameterTypes()));
			}

		}

		/////////////////////////////////////////////////////////////////////////////
		// 全メソッドを取得（スーパークラスは含まない）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateメソッド **********");
		for (Method method : File.class.getDeclaredMethods()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(method.getModifiers())) {
				System.out.println(method.getName());
			}

		}

		/////////////////////////////////////////////////////////////////////////////
		// 全フィールドを取得（スーパークラスは含まない）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateフィールド **********");
		for (Field field : File.class.getDeclaredFields()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(field.getModifiers())) {
				System.out.println(field.getName());
			}

		}

	}

}
