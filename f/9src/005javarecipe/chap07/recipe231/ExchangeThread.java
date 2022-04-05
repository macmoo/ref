package jp.co.shoeisha.javarecipe.chapter07.recipe231;

import java.util.concurrent.Exchanger;

public class ExchangeThread extends Thread {

	private String data;
	private long time;
	private Exchanger<String> exchanger;

	public ExchangeThread(String data, long time, Exchanger<String> exchanger){
		this.data = data;
		this.time = time;
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			// 交換前のデータを表示
			System.out.println(getName() + "(交換前): " + this.data);

			// コンストラクタで指定されたミリ秒待機
			Thread.sleep(this.time);

			// データを交換
			data = exchanger.exchange(this.data);

			// 交換後のデータを表示
			System.out.println(getName() + "(交換後): " + this.data);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();

		new ExchangeThread("data1", 1000, exchanger).start();
		new ExchangeThread("data2", 3000, exchanger).start();
	}

}
