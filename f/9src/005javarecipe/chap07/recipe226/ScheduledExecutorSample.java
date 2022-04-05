package jp.co.shoeisha.javarecipe.chapter07.recipe226;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorSample {

	public static void main(String[] args) throws InterruptedException {

		/////////////////////////////////////////////////////////////////////////////
		// 指定時間後にタスクを実行
		/////////////////////////////////////////////////////////////////////////////
		{
			// タスクをスケジュール可能なScheduledExecutorServiceを生成
			ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

			// 3秒後にタスクを実行
			executorService.schedule(new Runnable(){
				@Override
				public void run() {
					System.out.println("Executed");
				}
			}, 3000, TimeUnit.MILLISECONDS);

			// すべてのタスクが終了したらScheduledExecutorServiceをシャットダウン
			executorService.shutdown();
		}


		/////////////////////////////////////////////////////////////////////////////
		// 指定した間隔でタスクを実行
		/////////////////////////////////////////////////////////////////////////////
		{
			// タスクをスケジュール可能なScheduledExecutorServiceを生成
			ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

			// 1秒後から3秒間隔でタスクを実行
			executorService.scheduleAtFixedRate(new Runnable(){
				@Override
				public void run() {
					System.out.println("Rotating Executed" + new Date());
				}
			}, 1000, 3000, TimeUnit.MILLISECONDS);

			TimeUnit.MINUTES.sleep(1);

			// 1分後にScheduledExecutorServiceをシャットダウン
			executorService.shutdown();
		}

	}

}
