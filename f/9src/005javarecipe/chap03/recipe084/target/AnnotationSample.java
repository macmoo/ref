package jp.co.shoeisha.javarecipe.chapter03.recipe084.target;

import java.util.ArrayList;
import java.util.List;

@TypeAnnotation // ElementType.TYPE
public class AnnotationSample<@TypeParamAnnotation T> { // ElementType.TYPE_ PARAMETER

	@FieldAnnotation private int value; // ElementType.FIELD

	@ConstructorAnnotation // ElementType.CONSTRUCTOR
	public AnnotationSample() {
	}

	@MethodAnnotation // ElementType.METHOD
	public void methodWithNoParams() {
	}

	public int methodWithParams(@ParamAnnotation int param) {
		@LocalVarAnnotation int i = 0; // ElementType.LOCAL_VARIABLE
		return i;
	}

	//////////////////////////////////////////////////////////////////////
	// ElementType.TYPE_USE を指定したアノテーションを付与できる場所
	//////////////////////////////////////////////////////////////////////
	@SuppressWarnings("unused")
	// クラスの継承時、インターフェース実装時
	class MyClass implements @TypeUseAnnotation MyInterface {
		// メソッドの戻り値、例外の宣言
		public @TypeUseAnnotation String test() throws @TypeUseAnnotation Exception {

			// インスタンス生成時
			MyClass instance = new @TypeUseAnnotation MyClass();

			// キャスト時
			String str = (@TypeUseAnnotation String) null;

			// instanceof演算子
			if(str instanceof @TypeUseAnnotation String) {
			}

			// ジェネリクスの型パラメータ
			List<@TypeUseAnnotation String> list = new ArrayList<>();

			// 配列([1]に付与)
			String @TypeUseAnnotation [][] array1 = new String @TypeUseAnnotation [1][2];

			// 配列([2]に付与)
			String[] @TypeUseAnnotation [] array2 = new String[1] @TypeUseAnnotation [2];

			return "test";
		}

		// レシーバ
		public String toString(@TypeUseAnnotation MyClass this) {
			return "test";
		}
	}

	interface MyInterface {
	}

}