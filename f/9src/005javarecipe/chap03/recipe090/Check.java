package jp.co.shoeisha.javarecipe.chapter03.recipe090;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * アノテーションの定義
 */
@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE, ElementType.PACKAGE})
@Retention(RUNTIME)
public @interface Check {
	String value();
}
