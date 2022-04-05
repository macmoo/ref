package jp.co.shoeisha.javarecipe.chapter08.recipe249;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseErrorCodeSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// INSERT文を発行するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement("INSERT INTO book(id, name) VALUES (1, 'Java_Recipe')")) {
				// まずはレコードのINSERTを実行
				int insertCount = ps.executeUpdate();
				// INSERTに成功した場合
				System.out.println(insertCount + "件INSERTしました");
			} catch (SQLException e) {
				// 一意制約違反が発生した場合（エラーコード1062）はUPDATEを行なう
				if (e.getErrorCode() == 1062) {
					// UPDATE文を発行するためのPreparedStatementを生成
					try (PreparedStatement ps = con.prepareStatement("UPDATE book set name='Java_Recipe' where id = 1")) {
						int updateCount = ps.executeUpdate();
						System.out.println("一意制約違反が発生したため、bookテーブルのid=1を" + updateCount + "件UPDATEしました");
					} catch (SQLException se) {
						se.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}
	}
}
