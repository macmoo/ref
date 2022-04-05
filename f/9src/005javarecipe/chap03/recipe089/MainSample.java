package jp.co.shoeisha.javarecipe.chapter03.recipe089;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class MainSample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws NoSuchFieldException {

		Class<GenericSample> clazz = GenericSample.class;

		/////////////////////////////////////////////////////////////////////////////
		// 型変数: T
		/////////////////////////////////////////////////////////////////////////////
		{
			TypeVariable<?> type = (TypeVariable<?>) clazz.getField("t").getGenericType();

			String name = type.getName();
				// => "T"
			GenericDeclaration decl = type.getGenericDeclaration();
				// => Class<GenericSample>
			Type bound = type.getBounds()[0];
				// => Class<Object>

			System.out.println("*** 型変数: T ***");
			System.out.println(name);
			System.out.println(decl);
			System.out.println(bound);
		}

		/////////////////////////////////////////////////////////////////////////////
		// 型変数の配列: T[]
		/////////////////////////////////////////////////////////////////////////////
		{
			GenericArrayType tArray = (GenericArrayType) clazz.getField("tArray").getGenericType();
			TypeVariable<?> type = (TypeVariable<?>) tArray.getGenericComponentType();

			System.out.println("*** 型変数の配列: T[] ***");
			System.out.println(type.getName());
			System.out.println(type.getGenericDeclaration());
			System.out.println(type.getBounds()[0]);
		}

		/////////////////////////////////////////////////////////////////////////////
		// パラメータ化された型: List<String>
		/////////////////////////////////////////////////////////////////////////////
		{
			ParameterizedType type = (ParameterizedType) clazz.getField("list").getGenericType();

			Type rawType = type.getRawType();
				// => Class<List>
			Type actual = type.getActualTypeArguments()[0];
				// => Class<String>

			System.out.println("*** パラメータ化された型: List<String> ***");
			System.out.println(rawType);
			System.out.println(actual);
		}

		/////////////////////////////////////////////////////////////////////////////
		// パラメータ化された型: List<T>
		/////////////////////////////////////////////////////////////////////////////
		{
			ParameterizedType type = (ParameterizedType) clazz.getField("tList").getGenericType();

			Type rawType = type.getRawType();
				// => Class<List>
			Type actual = type.getActualTypeArguments()[0];
				// => TypeVariable

			System.out.println("*** パラメータ化された型: List<T> ***");
			System.out.println(rawType);
			System.out.println(actual);
		}

		/////////////////////////////////////////////////////////////////////////////
		// 制限つきパラメータ化された型: List<U>
		/////////////////////////////////////////////////////////////////////////////
		{
			ParameterizedType boundList = (ParameterizedType) clazz.getField("boundList").getGenericType();
			TypeVariable<?> type = (TypeVariable<?>) boundList.getActualTypeArguments()[0];

			String name = type.getName();
				// => "U"
			Type bound = type.getBounds()[0];
				// => Class<Exception>

			System.out.println("*** 制限つきパラメータ化された型: List<U> ***");
			System.out.println(name);
			System.out.println(bound);
		}

		/////////////////////////////////////////////////////////////////////////////
		// 上限つきワイルドカード: List<? extends Exception>
		/////////////////////////////////////////////////////////////////////////////
		{
			ParameterizedType wildList = (ParameterizedType) clazz.getField("wildList").getGenericType();
			WildcardType type = (WildcardType) wildList.getActualTypeArguments()[0];

			Type upperBound = type.getUpperBounds()[0];
				// => Class<Exception>
			Type[] lowerBounds = type.getLowerBounds();
				// => なし（長さ0の配列）

			System.out.println("*** 上限つきワイルドカード: List<? extends Exception> ***");
			System.out.println(upperBound);
			System.out.println(lowerBounds.length);
		}

		/////////////////////////////////////////////////////////////////////////////
		// GenericSampleクラスの情報
		/////////////////////////////////////////////////////////////////////////////
		{
			TypeVariable<Class<GenericSample>>[] types = clazz.getTypeParameters();

			String name1 = types[0].getName();
				// => "T"
			String name2 = types[1].getName();
				// => "U"

			System.out.println("*** GenericSampleクラスの情報 ***");
			System.out.println(name1);
			System.out.println(name2);
		}

		/////////////////////////////////////////////////////////////////////////////
		// GenericInterfaceインターフェースの情報
		/////////////////////////////////////////////////////////////////////////////
		{
			ParameterizedType type = (ParameterizedType) clazz.getGenericInterfaces()[0];

			String name = type.getTypeName();
				// => "GenericInterface<java.lang.Integer>"
			Type actual1 = type.getActualTypeArguments()[0];
				// => Class<Integer>

			System.out.println("*** GenericInterfaceインターフェースの情報 ***");
			System.out.println(name);
			System.out.println(actual1);
		}

	}

}
