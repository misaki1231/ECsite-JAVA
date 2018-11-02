
package com.internousdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver"; // MySQL接続に必要な情報の設定
	private static String url = "jdbc:mysql://localhost/ecsitemura";

	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url, user, password);
			// 接続情報から自分のパソコンにインストールされているMySQLへ接続する設定

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con; // MySQLに接続できたか確認 情報渡し
	}
}