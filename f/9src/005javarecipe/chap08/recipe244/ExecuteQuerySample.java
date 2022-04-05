package jp.co.shoeisha.javarecipe.chapter08.recipe244;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQuerySample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// SELECT文を発行するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement(
					"SELECT lastname, firstname FROM writer WHERE firstname = ?")) {
				// プレースホルダ 「?」に値をセット（第1引数はプレースホルダのインデックス）
				ps.setString(1, "Masanori");
				// SQLを発行してResultSetを受け取る
				try (ResultSet rs = ps.executeQuery()) {
					// ResultSetから結果を取得
					while (rs.next()) {
						// 取得するカラムをカラム名で指定
						String lastName = rs.getString("lastname");
						// 取得するカラムをインデックスで指定
						String firstName = rs.getString(2);
						System.out.println("firstnameがMasanoriのライターは:" + lastName + " " +
								firstName);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}

	}
}
