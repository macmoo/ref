package jp.co.shoeisha.javarecipe.chapter08.recipe247;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseFileInsertSample {

	public static void main(String[] args) throws FileNotFoundException {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// 画像データを格納するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement(
					"INSERT INTO image(imageName, imageData) values (?, ?)")) {
				// プレースホルダに画像ファイル名をセット
				ps.setString(1, "Duke");
				// プレースホルダに画像ファイルをInputStreamでセット
				ps.setBlob(2, new FileInputStream("src/jp/co/shoeisha/javarecipe/chapter09/recipe258/duke.png"));
				// SQLを発行して更新した行数を取得
				int insertResult = ps.executeUpdate();
				System.out.println(insertResult);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}

	}

}
