package jp.co.shoeisha.javarecipe.chapter07.recipe225;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainSample {

	public static void main(String[] args) {

		// 単一のスレッドで実行するExecutorServiceを生成
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// タスクを実行
		executorService.execute(new TestThread());
		executorService.execute(new TestThread());

		// すべてのタスクが終了したらExecutorServiceをシャットダウン
		executorService.shutdown();

	}

}
