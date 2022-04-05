package jp.co.shoeisha.javarecipe.chapter07.recipe227;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import jp.co.shoeisha.javarecipe.chapter07.recipe225.TestThread;

public class ThreadPoolSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// FixedThreadPool
		/////////////////////////////////////////////////////////////////////////////
		{
			// 常に10スレッドをプールするExecutorServiceを生成
			ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

			// タスクを実行
			fixedThreadPool.execute(new TestThread());
			fixedThreadPool.execute(new TestThread());

			// すべてのタスクが終了したらExecutorServiceをシャットダウン
			fixedThreadPool.shutdown();
		}

		/////////////////////////////////////////////////////////////////////////////
		// CachedThreadPool
		/////////////////////////////////////////////////////////////////////////////
		{
			// 必要に応じてスレッドのプール数が変化するExecutorServiceを生成
			ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

			// タスクを実行
			cachedThreadPool.execute(new TestThread());
			cachedThreadPool.execute(new TestThread());

			// すべてのタスクが終了したらExecutorServiceをシャットダウン
			cachedThreadPool.shutdown();
		}

		/////////////////////////////////////////////////////////////////////////////
		// ScheduledThreadPool
		/////////////////////////////////////////////////////////////////////////////
		{
			// 実行間隔を指定してタスクを実行可能なScheduledExecutorServiceを生成
			// （プールするスレッドの最小数は5に指定）
			ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

			// タスクを実行
			scheduledThreadPool.schedule(new Runnable(){
				@Override
				public void run() {
					System.out.println("Executed");
				}
			}, 3, TimeUnit.SECONDS);

			// すべてのタスクが終了したらScheduledExecutorServiceをシャットダウン
			scheduledThreadPool.shutdown();
		}

	}

}
