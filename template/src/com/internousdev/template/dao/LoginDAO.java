
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		LoginDTO loginDTO = new LoginDTO();
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // SQLに指定する値を動的に実行するため設定
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword); // SQL文の「？」パラメータに指定した値を挿入することが可

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if (!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}
}