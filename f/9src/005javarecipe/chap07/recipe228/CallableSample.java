package jp.co.shoeisha.javarecipe.chapter07.recipe228;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// java.util.Dateを返すタスクを実行
		Future<Date> future = executorService.submit(new Callable<Date>(){
			@Override
			public Date call() throws Exception {
				Thread.sleep(1000);
				return new Date();
			}
		});

		// 結果を取得（タスクの実行が完了するまでブロックされる）
		Date date = future.get();
		System.out.println(date);

		// すべてのタスクが終了したらExecutorServiceをシャットダウン
		executorService.shutdown();

	}

}
