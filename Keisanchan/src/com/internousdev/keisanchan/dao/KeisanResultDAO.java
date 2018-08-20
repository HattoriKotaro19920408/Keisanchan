package com.internousdev.keisanchan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.keisanchan.util.DBConnector;

public class KeisanResultDAO {





	public void keisan( String company_name, Double roe, Double roa, Double uriage_keijo_ratio, Double uriage_sori_ratio, Double uriage_eigyo_ratio, Double total_kaiten_ratio, Double zaiko_kaiten_ratio, Double ryudo_ratio, Double zikoshi_ratio, Double kotei_ratio, Double fusai_ratio) throws SQLException {

		DBConnector dbConnector = new DBConnector();

		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO login_user_transaction ( company_name, roe, roa, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, company_name);
			preparedStatement.setDouble(2, roe);
			preparedStatement.setDouble(3, roa);
			preparedStatement.setDouble(4, uriage_keijo_ratio);
			preparedStatement.setDouble(5, uriage_sori_ratio);
			preparedStatement.setDouble(6, uriage_eigyo_ratio);
			preparedStatement.setDouble(7, total_kaiten_ratio);
			preparedStatement.setDouble(8, zaiko_kaiten_ratio);
			preparedStatement.setDouble(9, ryudo_ratio);
			preparedStatement.setDouble(10, zikoshi_ratio);
			preparedStatement.setDouble(11, kotei_ratio);
			preparedStatement.setDouble(12, fusai_ratio);
			preparedStatement.execute();
		} catch(Exception e) {
				e.printStackTrace();
		} finally {
				connection.close();

		}

	}

}