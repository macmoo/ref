package jp.co.shoeisha.javarecipe.chapter10.recipe284;

public class ElapsedTimeSample {

	public static void main(String[] args) throws InterruptedException {
		/////////////////////////////////////////////////////////////////////////////
		// 経過時間をミリ秒単位で測定する
		/////////////////////////////////////////////////////////////////////////////
		{
			 long t1 = System.currentTimeMillis();
			 Thread.sleep(1000);
			 long t2 = System.currentTimeMillis();

			 // 経過時間をミリ秒単位で表示
			 System.out.println("経過時間(ミリ秒): " + (t2 - t1));
		}
		/////////////////////////////////////////////////////////////////////////////
		// 経過時間をナノ秒単位で測定する
		/////////////////////////////////////////////////////////////////////////////
		{
			long t1 = System.nanoTime();
			Thread.sleep(1000);
			long t2 = System.nanoTime();

			// 経過時間をナノ秒単位で表示
			System.out.println("経過時間(ナノ秒): " + (t2 - t1));
		}
	}

}
