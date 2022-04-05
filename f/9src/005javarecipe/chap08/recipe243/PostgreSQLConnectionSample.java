package jp.co.shoeisha.javarecipe.chapter08.recipe243;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnectionSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/java_recipe", "postgres", "password")) {
			//...ここでデータベースにアクセスする処理を実行...
			System.out.println("Connecttion success");
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}
	}
}
