package com.internousdev.keisanchan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.keisanchan.util.DBConnector;

public class KeisanResultDAO {





	public int keisan( String loginUserId, String company_name, String roe, String roa, String uriage_keijo_ratio, String uriage_sori_ratio, String uriage_eigyo_ratio, String total_kaiten_ratio, String zaiko_kaiten_ratio, String ryudo_ratio, String zikoshi_ratio, String kotei_ratio, String fusai_ratio) throws SQLException {
		int count = 0;
		DBConnector dbConnector = new DBConnector();

		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO keisan_transaction (login_id, company_name, roe, roa, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, company_name);
			preparedStatement.setString(3, roe);
			preparedStatement.setString(4, roa);
			preparedStatement.setString(5, uriage_keijo_ratio);
			preparedStatement.setString(6, uriage_sori_ratio);
			preparedStatement.setString(7, uriage_eigyo_ratio);
			preparedStatement.setString(8, total_kaiten_ratio);
			preparedStatement.setString(9, zaiko_kaiten_ratio);
			preparedStatement.setString(10, ryudo_ratio);
			preparedStatement.setString(11, zikoshi_ratio);
			preparedStatement.setString(12, kotei_ratio);
			preparedStatement.setString(13, fusai_ratio);
			count = preparedStatement.executeUpdate();
		} catch(Exception e) {
				e.printStackTrace();
		} finally {
				connection.close();

		}
		return count;

	}

}