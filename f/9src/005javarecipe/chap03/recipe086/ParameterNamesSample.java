package jp.co.shoeisha.javarecipe.chapter03.recipe086;

import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;

public class ParameterNamesSample {

	public static void main(String[] args) throws NoSuchMethodException {

		/////////////////////////////////////////////////////////////////////////////
		// 引数名を取得（Java 8）
		/////////////////////////////////////////////////////////////////////////////

		// コンストラクタの情報
		Executable exe = User.class.getConstructor(String.class);

		for (Parameter param : exe.getParameters()) {
			// 引数名
			String name = param.getName();
			System.out.println(name);
		}

	}

	/**
	 * 操作対象のクラス。
	 *
	 * Eclipseの場合は、Javaのコンパイラの設定で、
	 * ［Store method parameter names］にチェックを入れておかないと
	 * パラメータ名を取得することができません。
	 */
	public static class User {

		private final String initial;

		public User(String initial) {
			this.initial = initial;
		}

		public String getInitial() {
			return this.initial;
		}

	}

}
