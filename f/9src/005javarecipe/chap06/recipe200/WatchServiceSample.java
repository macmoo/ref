package jp.co.shoeisha.javarecipe.chapter06.recipe200;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Cドライブの直下を監視
		Path dir = Paths.get("C:¥¥");
		WatchService watcher = FileSystems.getDefault().newWatchService();
		// 監視するイベントの種類を設定
		dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);
		
		while (true) {
			WatchKey watchKey = watcher.take();
			for (WatchEvent<?> event : watchKey.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();
				if (kind == StandardWatchEventKinds.OVERFLOW) {
					continue;
				}
				// 変更のあったパスを取得
				Path name = (Path) event.context();
				Path child = dir.resolve(name);
				
				if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
					System.out.println(child + "が作成されました。");
				} else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
					System.out.println(child + "が削除されました。");
				} else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
					System.out.println(child + "が更新されました。");
				}
			}
			watchKey.reset();
		}
	}
}
