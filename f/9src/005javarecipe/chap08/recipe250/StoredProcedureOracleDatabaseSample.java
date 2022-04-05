package jp.co.shoeisha.javarecipe.chapter08.recipe250;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/////////////////////////////////////////////////////////////////////////////
// Oracle JDBCドライバーにクラスパスを設定した後に、以下の行のコメントを外してください。
/////////////////////////////////////////////////////////////////////////////
//import oracle.jdbc.OracleTypes;

public class StoredProcedureOracleDatabaseSample {

	public static void main(String[] args) {
		// 第1引数はjava_recipeデータベースに接続するデータベース接続URL
		// 第2引数はユーザ名（root）、第3引数はパスワード（password）
		try (Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/PDBORCL", "recipe", "password")) {
			// ストアドプロシージャを呼び出すCallableStatementを生成
			// ストアドプロシージャを呼び出すCallableStatementを生成
			try (CallableStatement cs = con.prepareCall("call get_writer(?, ?)")) {
				// 1つ目のプレースホルダにストアドプロシージャの入力引数をセット
				cs.setString(1, "Satoh");
				// 2つ目のプレースホルダにストアドプロシージャの戻り値（型はOracleのカーソル）をセット
				/////////////////////////////////////////////////////////////////////////////
				// Oracle JDBCドライバーにクラスパスを設定した後に、以下の行のコメントを外してください。
				/////////////////////////////////////////////////////////////////////////////
				//cs.registerOutParameter(2, OracleTypes.CURSOR);
				// SQLを発行する
				cs.execute();
				// CallableStatement実行結果の戻り値オブジェクトからResultSetを取得
				try (ResultSet rs = (ResultSet) cs.getObject(2)) {
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
