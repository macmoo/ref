package jp.co.shoeisha.javarecipe.chapter02.recipe040;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

public class DatabaseManager {
	
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password");
	}

	public static void execute(Consumer<Connection> consumer) throws SQLException {
		// コネクションを取得
		try (Connection conn = getConnection()) {
			try {
				// 引数で受け取った関数型インターフェースを呼び出し
				consumer.accept(conn);
				// 処理が正常に終了したらコミット
				conn.commit();
			} catch (Exception ex) {
				// 例外が発生した場合はロールバック
				conn.rollback();
				throw ex;
			}
		}
	}


}
