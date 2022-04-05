package jp.co.shoeisha.javarecipe.chapter02.recipe025;

import java.io.File;

/**
 * タグの記述例を書いたクラスです。 
 * 詳細は<a href="{@docRoot}/copyright.html">Copyright</a>を参照してください。
 *
 * @param <E> 型パラメータの説明 // 意味が明白なため省略されることも多い
 * @author Takako Shimamoto
 * @version 1.1
 * @see java.util.List#contains(Object)
 * @see File#toURI () // 同一パッケージまたはインポートされたクラスはパッケージ名を省略
 * @see #method(String) // 自クラスのメンバはパッケージ名とクラス名を省略
 * @since 1.0
 */
public class JavadocSample2<E> {
	
	/**
	 * メッセージは{@value} // => メッセージは"Hello"
	 */
	private static final String MESSAGE = "Hello";

	/**
	 * 以下のように定数を指定することも可能。
	 * 
	 * @return メッセージは{@value #MESSAGE} // => メッセージは"Hello"
	 */
	public String message() {
		return MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	public void write() {
	}

	/**
	 * ...
	 * 
	 * @deprecated 推奨されていません。1.1以降は{@link #output(int)}に置き換えられました。
	 */
	@Deprecated
	public void out() {
	}

	/**
	 * パッケージ{@code java.nio.file}をコードフォントで表示。
	 * {@code index < 0}のように不等号をそのまま記述可能。
	 * {@literal @}や{@literal <p>}は自動的にエスケープされる。
	 */
	public void output(int index) {
	}
	
}