package jp.co.shoeisha.javarecipe.chapter07.recipe234;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueSample {

	private final TransferQueue<String> queue = new LinkedTransferQueue<>();

	public String receive() throws InterruptedException {
		Thread.sleep(5000);

		System.out.println("メッセージを受信します");

		// データを受け取る
		String message = queue.take();

		System.out.println(String.format("メッセージ「%s」を受信しました", message));

		return message;
	}

	public void send(String message) throws InterruptedException {
		System.out.println(String.format("メッセージ「%s」を送信します", message));

		// データを追加
		queue.transfer(message);

		System.out.println(String.format("メッセージ「%s」を送信しました", message));
	}

	public static void main(String[] args) {
		TransferQueueSample transfer = new TransferQueueSample();

		/////////////////////////////////////////////////////////////////////////////
		// 送信
		/////////////////////////////////////////////////////////////////////////////
		{
			Runnable r = new Runnable() {
				@Override
			    public void run() {
					try {
						transfer.send("a");

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			new Thread(r).start();
		}

		/////////////////////////////////////////////////////////////////////////////
		// 受信
		/////////////////////////////////////////////////////////////////////////////
		{
			Runnable r = new Runnable() {
				@Override
			    public void run() {
					try {
						String str = transfer.receive();
						System.out.println("結果: " + str);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			new Thread(r).start();
		}

	}

}
