package jp.co.shoeisha.javarecipe.chapter07.recipe239;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

	// 初期値=1を指定してAtomicIntegerを生成
	private AtomicInteger counter = new AtomicInteger(1);

	public int next() {
		return counter.getAndIncrement();
	}
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(100);
		AtomicCounter counter = new AtomicCounter();
		
		// 100スレッドでカウンタをインクリメント
		for(int i = 0; i < 100; i++){
			Thread t = new Thread(){
				@Override
				public void run() {
					System.out.println(getName() + ": " + counter.next());
					latch.countDown();
				}
			};
			t.start();
		}
		
		latch.await();
		
		System.out.println("Result: " + counter.next());
	}

}
