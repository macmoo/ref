package jp.co.shoeisha.javarecipe.chapter11.recipe307;

import java.util.concurrent.Flow;

public class SampleSubscriber<T> implements Flow.Subscriber<T> {
	private Flow.Subscription subscription;

	// Publisherへの登録時に呼び出される
	@Override public void onSubscribe(Flow.Subscription subscription) {
		System.out.println("onSubscribe");
		this.subscription = subscription;
		subscription.request(1); // 最初の1件を要求
	}

	// メッセージの配信時に呼び出される
	@Override public void onNext(T item) {
		System.out.println("onNext: " + item);
		this.subscription.request(1); // 1件処理する毎に次の1件を要求
	}

	// ストリームの終了時に呼び出される
	@Override public void onComplete() {
		System.out.println("onComplete");
	}

	// エラー時に呼び出される
	@Override public void onError(Throwable throwable) {
		System.out.println("onError: " + throwable.getMessage());
	}
}