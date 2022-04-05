package jp.co.shoeisha.javarecipe.chapter03.recipe084.marker;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.*;

/**
 * マーカ・アノテーション.
 * 利用例: @Check
 */
@Documented
@Inherited
@Target({TYPE, METHOD})	// クラスやインターフェースや列挙型、メソッドに付与できる
@Retention(RUNTIME)		// コンパイル時に保存し、実行時にJava VM上にも保持
public @interface Check {

}
