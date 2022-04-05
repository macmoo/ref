package jp.co.shoeisha.javarecipe.chapter07.recipe217;

public class DrawThread extends Thread {

	// 排他制御を行なうインスタンス
	Card card;

	DrawThread(Card card) {
		this.card = card;
	}

	@Override
	public void run() {
		// cardインスタンスのロックを取得した1スレッドのみ実行できる
		synchronized (card) {
			card.draw(100);
		}
	}

}
