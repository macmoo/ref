package jp.co.shoeisha.javarecipe.chapter08.recipe251;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseBatchSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// UPDATE文を発行するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement("UPDATE writer set lastname = ? where lastname = ?")) {
				// 1件目のパラメータを設定
				ps.setString(1, "Satou");
				ps.setString(2, "Satoh");
				ps.addBatch();
				// 2件目のパラメータを設定
				ps.setString(1, "Taka");
				ps.setString(2, "Takahashi");
				ps.addBatch();
				// 異なるSQLを同時に実行することもできる
				ps.addBatch("INSERT INTO writer(lastname, firstname) VALUES ('Duke','')");
				// SQLを一括実行
				int results[] = ps.executeBatch();
				// 実行結果を出力
				for (int i = 0; i < results.length; i++) {
					System.out.println((i + 1) + "件目のSQLで更新した件数は" + results[i] + "件です");
				}
				// addBatchした内容をクリア
				ps.clearBatch();
			} catch (BatchUpdateException e) {
				// バッチ処理に失敗した場合
				System.out.println(e.getUpdateCounts().length + "個までのSQL更新に成功しました");
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}
	}
}
