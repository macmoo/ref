package jp.co.shoeisha.javarecipe.chapter07.recipe233;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class BlockingQueueSample {

	private final BlockingQueue<String> queue = new SynchronousQueue<>();

	public String get() throws InterruptedException {
		// 先頭の要素を取得（キューからは削除される）
		// 追加が行なわれるまでブロックする
		return queue.take();
	}

	public void add(String value) throws InterruptedException {
		// キューに要素を追加
		// 取得が行なわれるまでブロックする
		queue.put(value);
	}

	public static void main(String[] args) {
		BlockingQueueSample blocking = new BlockingQueueSample();

		/////////////////////////////////////////////////////////////////////////////
		// 追加
		/////////////////////////////////////////////////////////////////////////////
		{
			AtomicInteger i = new AtomicInteger();

			Runnable r = new Runnable() {
				@Override
			    public void run() {
					try {
						TimeUnit.SECONDS.sleep(i.addAndGet(2));

						blocking.add(Thread.currentThread().getName() + new Date());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			new Thread(r).start();
			new Thread(r).start();
			new Thread(r).start();
		}

		/////////////////////////////////////////////////////////////////////////////
		// 取得
		/////////////////////////////////////////////////////////////////////////////
		{
			Runnable r = new Runnable() {
				@Override
			    public void run() {
					try {
						System.out.println(blocking.get());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			new Thread(r).start();
			new Thread(r).start();
			new Thread(r).start();
		}

	}

}
