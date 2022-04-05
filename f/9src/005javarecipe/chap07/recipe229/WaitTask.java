package jp.co.shoeisha.javarecipe.chapter07.recipe229;

import java.util.concurrent.Callable;

public class WaitTask implements Callable<String> {

	private long time;

	public WaitTask(long time){
		this.time = time;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(this.time);

		return time + "ミリ秒待機しました。";
	}

}
