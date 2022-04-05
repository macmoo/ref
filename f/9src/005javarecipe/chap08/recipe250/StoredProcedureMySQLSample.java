package jp.co.shoeisha.javarecipe.chapter08.recipe250;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedureMySQLSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// ストアドプロシージャを呼び出すCallableStatementを生成
			try (CallableStatement cs = con.prepareCall("CALL get_writer(?)")) {
				// プレースホルダに値をセット
				cs.setString(1, "Satoh");
				// SQLを発行してResultSetを受け取る
				try (ResultSet rs = cs.executeQuery()) {
					while (rs.next()) {
						// カラム名を指定して結果を取得
						String lastName = rs.getString("lastname");
						String firstName = rs.getString("firstname");
						System.out.println("get_writerの結果は:" + lastName + " " + firstName);
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
