package jp.co.shoeisha.javarecipe.chapter05.recipe153;

import java.time.Clock;
import java.time.LocalDateTime;

public class MyBean {
	private Clock clock;

	// 例としてここではシステムクロックをコンストラクタから渡せるようにする
	public MyBean(Clock clock) {
		this.clock = clock;
	}

	// 指定したシステムクロックから現在日時を取得
	public LocalDateTime current() {
		return LocalDateTime.now(clock);
	}


}
