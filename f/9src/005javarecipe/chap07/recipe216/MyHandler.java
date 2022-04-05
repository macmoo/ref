package jp.co.shoeisha.javarecipe.chapter07.recipe216;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyHandler implements UncaughtExceptionHandler {

	// 例外によってスレッドが止まったときに呼び出される
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("例外発生: " + t.getId());
		e.printStackTrace();
	}

}
