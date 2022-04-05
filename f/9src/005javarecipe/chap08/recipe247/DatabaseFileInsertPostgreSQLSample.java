package jp.co.shoeisha.javarecipe.chapter08.recipe247;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseFileInsertPostgreSQLSample {

	public static void main(String[] args) throws FileNotFoundException {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/java_recipe", "postgres", "password")) {
			// 画像データを格納するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement(
					"INSERT INTO image(imagename, imagedata) values (?, ?)")) {
				// 挿入する画像のストリームを取得
				File inputFile = new File("src/jp/co/shoeisha/javarecipe/chapter09/recipe258/duke.png");
				FileInputStream input = new FileInputStream(inputFile);
				// プレースホルダに画像ファイル名をセット
				ps.setString(1, "Duke");
				// プレースホルダに画像ファイルをInputStreamでセット
				ps.setBinaryStream(2, input, inputFile.length());
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
