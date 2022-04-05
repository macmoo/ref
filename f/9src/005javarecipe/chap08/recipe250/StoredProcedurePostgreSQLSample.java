package jp.co.shoeisha.javarecipe.chapter08.recipe250;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedurePostgreSQLSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/java_recipe", "postgres", "password")) {
			// カーソル移動するためオートコミットを解除
			con.setAutoCommit(false);
			// ストアドプロシージャを呼び出すCallableStatementを生成
			try (CallableStatement cs = con.prepareCall("{? = CALL get_writer(?)}")) {
				// 1つ目のプレースホルダにストアドプロシージャの戻り値をセット
				cs.registerOutParameter(1, Types.OTHER);
				// 2つ目のプレースホルダにストアドプロシージャの入力引数をセット
				cs.setString(2, "Satoh");
				// SQLを発行
				cs.execute();
				// CallableStatement実行結果からResultSetを取得
				try (ResultSet rs = (ResultSet) cs.getObject(1)) {
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
