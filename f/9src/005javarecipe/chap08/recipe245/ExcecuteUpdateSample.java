package jp.co.shoeisha.javarecipe.chapter08.recipe245;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcecuteUpdateSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/java_recipe", "root", "password")) {
			/////////////////////////////////////////////////////////////////////////////
			// INSERT
			/////////////////////////////////////////////////////////////////////////////
			{
				//INSERT文を発行するためのPreparedStatementを生成
				try (PreparedStatement ps = con.prepareStatement(
						"INSERT INTO writer(lastname, firstname) VALUES (?, ?)")) {
					//プレースホルダに値をセット
					ps.setString(1, "Takahashi");
					ps.setString(2, "Kazuya");
					//SQLを発行して更新した行数を取得
					int result = ps.executeUpdate(); // => 1
					System.out.println(result);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			/////////////////////////////////////////////////////////////////////////////
			// UPDATE
			/////////////////////////////////////////////////////////////////////////////
			{
				//UPDATE文を発行するためのPreparedStatementを生成
				try (PreparedStatement ps = con.prepareStatement(
						"UPDATE writer SET lastname = ? WHERE lastname = ?")) {
					//プレースホルダに値をセット
					ps.setString(1, "Satoh");
					ps.setString(2, "Satou");
					//SQLを発行して更新した行数を取得
					int result = ps.executeUpdate(); // => 1
					System.out.println(result);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			/////////////////////////////////////////////////////////////////////////////
			// DELETE
			/////////////////////////////////////////////////////////////////////////////
			{
				//DELETE文を発行するためのPreparedStatementを生成
				try (PreparedStatement ps = con.prepareStatement(
						"DELETE FROM writer WHERE lastname = ?")) {
					//プレースホルダに値をセット
					ps.setString(1, "Takahashi");
					//SQLを発行して更新した行数を取得
					int result = ps.executeUpdate(); // => 1
					System.out.println(result);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			/////////////////////////////////////////////////////////////////////////////
			// DDL
			/////////////////////////////////////////////////////////////////////////////
			{
				//CREATE TABLE文を発行するためのPreparedStatementを生成
				try (PreparedStatement ps = con.prepareStatement(
						"CREATE TABLE `java_recipe`.`recipes` (`id` INT NOT NULL)")) {
					int result = ps.executeUpdate(); // => 0
					System.out.println(result);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// データベースの接続に失敗した場合
			e.printStackTrace();
		}

	}

}
