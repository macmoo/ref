package jp.co.shoeisha.javarecipe.chapter07.recipe232;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierThread extends Thread {

	private long time;
	private CyclicBarrier barrier;

	public CyclicBarrierThread(long time, CyclicBarrier barrier){
		this.time = time;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			// 無限ループで繰り返し実行
			while(true){
				// コンストラクタで指定されたミリ秒待機
				Thread.sleep(this.time);

				// 3つのスレッドがawait()に到達するまで待機
				System.out.println(getName() + ": Wait");
				this.barrier.await();
				System.out.println(getName() + ": End");
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 3スレッドで待ち合わせを行なうCyclicBarrierを生成
		CyclicBarrier barrier = new CyclicBarrier(3);

		// 待機時間の異なる3つのスレッドを実行
		new CyclicBarrierThread(1000, barrier).start();
		new CyclicBarrierThread(2000, barrier).start();
		new CyclicBarrierThread(3000, barrier).start();
	}

}
