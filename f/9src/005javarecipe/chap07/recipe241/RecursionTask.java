package jp.co.shoeisha.javarecipe.chapter07.recipe241;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecursionTask extends RecursiveTask<String> {

	private final List<String> data;
	private final String result;

	public RecursionTask(List<String> data, String result) {
		this.data = data;
		this.result = result;
	}

	@Override
	protected String compute() {
		int size = data.size();

		// データのサイズが3を超えている場合は分割
		if(size > 3) {
			int i = size / 2;

			// 2つに分割
			List<String> list1 = data.subList(0, i);
			List<String> list2 = data.subList(i, size);

			RecursionTask task1 = new RecursionTask(list1, result);

			// 分割したデータを非同期に実行
			task1.fork();

			RecursionTask task2 = new RecursionTask(list2, result);

			// 処理結果をマージして返す
			return task2.compute() + task1.join();
		}

		// データのサイズが小さいので処理を行なう
		StringBuilder sb = new StringBuilder();
		for(String str : data) {
			sb.append(String.format("「%s」", str));
		}

		return result + sb.toString();
	}

}
