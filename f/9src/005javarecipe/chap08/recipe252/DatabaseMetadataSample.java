package jp.co.shoeisha.javarecipe.chapter08.recipe252;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetadataSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			DatabaseMetaData databaseMetaData = con.getMetaData();
			// 結果は"MySQL"
			System.out.println(databaseMetaData.getDatabaseProductName());
			// メソッドによってはResultSetを返す
			try (ResultSet rs = databaseMetaData.getColumns("", "java_recipe", "writer", "%")) {
				while (rs.next()) {
					System.out.println(rs.getString("COLUMN_NAME"));
					System.out.println(rs.getString("COLUMN_SIZE"));
					System.out.println(rs.getString("IS_AUTOINCREMENT"));
				}
				// マイナーバージョンを確認
				System.out.println(databaseMetaData.getJDBCMinorVersion()); // => 0
				// 機能をサポートするか確認
				System.out.println(databaseMetaData.supportsBatchUpdates()); // => true
			} catch (SQLException e) {
				// データベースの接続に失敗した場合
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}

	}

}
