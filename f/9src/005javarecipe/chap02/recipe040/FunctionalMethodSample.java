package jp.co.shoeisha.javarecipe.chapter02.recipe040;

import java.sql.SQLException;


public class FunctionalMethodSample {
	
	public static void main(String[] args) throws SQLException {
		DatabaseManager.execute((conn) -> {
			// ...データベース処理...
		});
	}

}
