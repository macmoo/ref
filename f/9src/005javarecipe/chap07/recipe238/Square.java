package jp.co.shoeisha.javarecipe.chapter07.recipe238;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.StampedLock;

public class Square {

	private final StampedLock lock = new StampedLock();

	private double width;
	private double height;

	public Square(double width, double height){
		this.width = width;
		this.height = height;
	}

	/**
	 * 四角を拡大する。
	 * @param magnification 倍率
	 */
	public void expand(double magnification) {
		// 書き込みロックを取得
		long stamp = lock.writeLock();

		width = width * magnification;
		height = height * magnification;

		// 書き込みロックを解放
		lock.unlockWrite(stamp);
	}

	/**
	 * 四角の面積を計算する。
	 * @return 面積
	 */
	public double calculateArea() {
		// 楽観的読み取りのためのスタンプを取得
		long stamp = lock.tryOptimisticRead();

		double currentWidth = width;
		double currentHeight = height;

		// 他のスレッドから値が更新されていないことを確認
		if(!lock.validate(stamp)){
			try {
				// 他のスレッドから値が更新されていた場合は
				// 読み取りロックを取得したうえで再度読み取り
				stamp = lock.readLock();

				currentWidth = width;
				currentHeight = height;

			} finally {
				// 読み取りロックを解放
				lock.unlockRead(stamp);
			}
		}

		// 面積を計算して返す
		return currentWidth * currentHeight;
	}
	
	public static void main(String[] args) throws InterruptedException {
		{
			CountDownLatch latch = new CountDownLatch(10);
			Square square = new Square(10d, 5d);
			
			// 10スレッドで拡大と面積の計算を実行
			for(int i = 0; i < 10; i++){
				Thread t = new Thread(){
					@Override
					public void run() {
						square.expand(2d);
						
						double area = square.calculateArea();
						System.out.println(getName() + ": " + (long) area);
						
						latch.countDown();
					}
				};
				t.start();
			}
			latch.await();
			
			// widthとheightの比率（2:1）は変わらない
			System.out.println(square.width / square.height);
		}
	}

}
