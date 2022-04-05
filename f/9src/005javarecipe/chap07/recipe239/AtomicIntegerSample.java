package jp.co.shoeisha.javarecipe.chapter07.recipe239;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class AtomicIntegerSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// AtomicIntegerの主なメソッド
		/////////////////////////////////////////////////////////////////////////////
		{
			// 初期値=0を指定してAtomicIntegerを生成
			AtomicInteger i = new AtomicInteger(0);

			// 値を取得
			int result1 = i.get();
			System.out.println("result1: " + result1);

			// 値を設定
			i.set(2);

			// 値を取得してから引数で指定した値を設定
			int result2 = i.getAndSet(2);
			System.out.println("result2: " + result2);

			// 引数で指定した値を加算してから値を取得
			int result3 = i.addAndGet(3);
			System.out.println("result3: " + result3);

			// 値を取得してからインクリメント
			int result4 = i.getAndIncrement();
			System.out.println("result4: " + result4);

			// インクリメントしてから値を取得
			int result5 = i.incrementAndGet();
			System.out.println("result5: " + result5);

			// 値を取得してからデクリメント
			int result6 = i.getAndDecrement();
			System.out.println("result6: " + result6);

			// デクリメントしてから値を取得
			int result7 = i.decrementAndGet();
			System.out.println("result7: " + result7);

			// 値が5だった場合のみ10をセット
			if(i.compareAndSet(5, 10)){
				System.out.println("値が5だった場合");
			} else {
				System.out.println("値が5ではなかった場合");
			}

			System.out.println("結果: " + i.get());
		}

		/////////////////////////////////////////////////////////////////////////////
		// ラムダ式を使う（Java 8）
		/////////////////////////////////////////////////////////////////////////////
		{
			// 初期値=5を指定してAtomicIntegerを生成
			AtomicInteger i = new AtomicInteger(5);

			// 2倍してから値を取得
			int result1 = i.updateAndGet(a -> a * 2);
			System.out.println("result1: " + result1);

			// 1を加算してから値を取得
			int result2 = i.accumulateAndGet(1, (a, b) -> a + b);
			System.out.println("result2: " + result2);
		}

		/////////////////////////////////////////////////////////////////////////////
		// LongAdderを使う（Java 8）
		/////////////////////////////////////////////////////////////////////////////
		{
			// LongAdderを生成（初期値は0）
			LongAdder longAdder = new LongAdder();

			// 加算
			longAdder.add(100);
			// インクリメント
			longAdder.increment();
			// デクリメント
			longAdder.decrement();

			// 値をlong型で取得
			long value = longAdder.longValue();
			System.out.println(value);
		}
	}

}
