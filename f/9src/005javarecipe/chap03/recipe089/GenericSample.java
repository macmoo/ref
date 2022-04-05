package jp.co.shoeisha.javarecipe.chapter03.recipe089;

import java.util.List;

/**
 * ジェネリクスを使ったインターフェース
 */
interface GenericInterface<V> {

}

/**
 * ジェネリクス情報の取得対象となるクラス
 */
public class GenericSample<T, U extends Exception> implements GenericInterface<Integer> {
	public T t;
	public T[] tArray;
	public List<String> list;
	public List<T> tList;
	public List<U> boundList;
	public List<? extends Exception> wildList;

}
