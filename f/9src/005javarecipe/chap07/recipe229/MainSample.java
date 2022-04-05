package jp.co.shoeisha.javarecipe.chapter07.recipe229;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		ExecutorCompletionService<String> service = new ExecutorCompletionService<>(threadPool);

		service.submit(new WaitTask(5000));
		service.submit(new WaitTask(3000));
		service.submit(new WaitTask(1000));

		// 3つの結果を受け取るまでループ
		for(int i = 0; i < 3; i++){
			Future<String> future = service.take();
			System.out.println(future.get());
		}

		// すべてのタスクが終了したらExecutorServiceをシャットダウン
		threadPool.shutdown ( );

	}

}
