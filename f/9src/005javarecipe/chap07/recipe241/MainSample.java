package jp.co.shoeisha.javarecipe.chapter07.recipe241;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class MainSample {

	public static void main(String[] args) {

		List<String> pool = Arrays.asList(
				"one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten");

		// 引数なしコンストラクタを使った場合は、プロセッサ数分のワーカースレッドが生成される
		ForkJoinPool forkjoin = new ForkJoinPool();

		// 実行。結果を受け取るまで待機する
		String result = forkjoin.invoke(new RecursionTask(pool, "*"));

		System.out.println(result);
	}

}
