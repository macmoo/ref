package jp.co.shoeisha.javarecipe.chapter08.recipe248;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseFileSelectSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			// 画像データを取得するためのPreparedStatementを生成
			try (PreparedStatement ps = con.prepareStatement(
					"SELECT imagedata FROM image where imagename = ?")) {
				// プレースホルダに値をセット
				ps.setString(1, "Duke");
				// SQLを発行してResultSetを受け取る
				try (ResultSet rs = ps.executeQuery()) {
					// ResultSetから結果を取得
					while (rs.next()) {
						// 画像データをBlob型で取得
						Blob imageData = rs.getBlob("imagedata");
						InputStream is = imageData.getBinaryStream();
						// FileOutputStreamを使ってデータを書き出す
						try (FileOutputStream fos = new FileOutputStream(
								"src/jp/co/shoeisha/javarecipe/chapter09/recipe259/duke.png")) {
							// 4096バイトずつ読み込み
							byte[] buffer = new byte[4096];
							while (true) {
								int length = is.read(buffer);
								if (length < 0) {
									break;
								}
								fos.write(buffer, 0, length);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
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
