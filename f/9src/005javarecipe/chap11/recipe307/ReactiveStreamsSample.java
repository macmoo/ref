package jp.co.shoeisha.javarecipe.chapter11.recipe307;

import java.util.concurrent.SubmissionPublisher;

public class ReactiveStreamsSample {

	public static void main(String[] args) throws InterruptedException {
		// Publisherを生成
		var publisher = new SubmissionPublisher<String>();
		// Subscriberを生成
		var subscriber = new SampleSubscriber<String>();
		// SubscriberをPublisherに追加
		publisher.subscribe(subscriber);

		// メッセージを送信
		publisher.submit("Java 6");
		publisher.submit("Java 7");
		publisher.submit("Java 8");
		publisher.submit("Java 11");
		// ストリームを終了
		publisher.close();

		// 終了するまで待つ
		Thread.sleep(1000);
	}

}
