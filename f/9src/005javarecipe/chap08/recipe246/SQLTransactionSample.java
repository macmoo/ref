package jp.co.shoeisha.javarecipe.chapter08.recipe246;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLTransactionSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// 自動コミットモードを解除
			con.setAutoCommit(false);
			// DELETE文を発行するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement("DELETE FROM writer WHERE lastName = ?")) {
				// まず1レコード削除
				ps.setString(1, "Takahashi");
				int deletedRows = ps.executeUpdate();
				// さらに1レコード削除
				ps.setString(1, "Takezoe");
				deletedRows = deletedRows + ps.executeUpdate();
				// 2レコード削除されていなければロールバック
				if (deletedRows == 2) {
					// 変更をコミット
					con.commit();
					System.out.println("2件のレコードの削除に成功したため、トランザクションをコミットしました。");
				} else {
					// 変更をロールバック
					con.rollback();
					System.out.println("2件のレコードの削除に失敗したため、トランザクションをロールバックしました。");
				}
			} catch (SQLException e) {
				// 例外発生時もロールバック
				con.rollback();
				throw e;
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}

	}
}
