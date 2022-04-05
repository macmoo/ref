package jp.co.shoeisha.javarecipe.chapter10.recipe286;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JULSample {

	//完全修飾クラス名でLoggerを作成
	private static final Logger logger = Logger.getLogger("jp.co.shoeisha.javarecipe.chapter11.recipe299.JULSample");

	public static void main(String[] args) throws SecurityException, FileNotFoundException, IOException {
		/////////////////////////////////////////////////////////////////////////////
		// ログ出力
		/////////////////////////////////////////////////////////////////////////////
		{
			logger.finest("これはFINEST");
			logger.finer("こっちはFINER");
			logger.fine("これはFINE");
			logger.config("ここがCONFIG");
			logger.info("ここからINFO");
			logger.warning("これは警告");
			logger.severe("致命的");
		}
		/////////////////////////////////////////////////////////////////////////////
		// 例外のログ出力
		/////////////////////////////////////////////////////////////////////////////
		{
			try {
				//…
			} catch (Exception ex) {
				logger.log(Level.SEVERE, "エラーが発生しました", ex);
				throw ex;
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		// loggingSample.propertiesからログ設定を読み込む
		/////////////////////////////////////////////////////////////////////////////
		{
			LogManager.getLogManager().readConfiguration(
					new FileInputStream("src/jp/co/shoeisha/javarecipe/chapter11/recipe299/loggingSample.properties"));
		}
		/////////////////////////////////////////////////////////////////////////////
		// パフォーマンスが低下しにくいログ出力
		/////////////////////////////////////////////////////////////////////////////
		{
			String infoMsg = "logging";
			// ログを出力する前にログレベルを確認
			if (logger.isLoggable(Level.INFO)) {
				logger.info("Info:" + infoMsg);
			}
			// ラムダ式を使った遅延評価
			logger.info(() -> "Info:" + infoMsg);
		}
	}

}
