package jp.co.shoeisha.javarecipe.chapter03.recipe090;

/**
 * 操作対象のクラス
 */
@Check("クラスに付与")
public class AnnotationSample<@Check("クラスの型パラメータに付与") T> extends @Check("親クラスに付与") MySuperClass{

	@Check("メソッドに付与")
	public void print(@Check("引数に付与") String message) {
		System.out.println(message);
	}

	public <@Check("メソッドの型パラメータに付与") E> void test(E arg) {
	}

	public @Check("戻り値の型に付与") String hello() throws @Check("例外に付与") Exception {
		return "Hello";
	}

}
