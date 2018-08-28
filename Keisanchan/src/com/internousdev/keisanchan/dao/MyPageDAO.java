package com.internousdev.keisanchan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.keisanchan.dto.MyPageDTO;
import com.internousdev.keisanchan.util.DBConnector;

public class MyPageDAO {
	MyPageDTO myPageDTO = new MyPageDTO();

//	public MyPageDTO getKeisanResultInfo(String loginUserId,String loginPassword){
//		MyPageDTO myPageDTO = new MyPageDTO();
//		DBConnector dbConnector = new DBConnector();
//		 Connection connection = dbConnector.getConnection();
//		String sql="Select login_id,"
//				+ " company_name , "
//				+ "roe,"
//				+ "roa,"
//				+ "uriage_keijo_ratio,"
//				+ "uriage_sori_ratio,"
//				+ "uriage_eigyo_ratio,"
//				+ "total_kaiten_ratio, "
//				+ "zaiko_kaiten_ratio, "
//				+ "ryudo_ratio, "
//				+ "zikoshi_ratio, "
//				+ "kotei_ratio, "
//				+ "fusai_ratio "
//				+ "FROM keisan_transaction "
//				+ "WHERE login_id = ?";


public List<MyPageDTO> getKeisanResultInfo(String login_id)throws SQLException{
		 DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();
		 List<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		String sql="Select login_id,"
				+ " company_name , "
				+ "roe,"
				+ "roa,"
				+ "uriage_keijo_ratio,"
				+ "uriage_sori_ratio,"
				+ "uriage_eigyo_ratio,"
				+ "total_kaiten_ratio, "
				+ "zaiko_kaiten_ratio, "
				+ "ryudo_ratio, "
				+ "zikoshi_ratio, "
				+ "kotei_ratio, "
				+ "fusai_ratio "
				+ "FROM keisan_transaction "
				+ "WHERE login_id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,login_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setlogin_id(resultSet.getString("login_id"));
				dto.setCompany_name(resultSet.getString("company_name"));
				dto.setRoe(resultSet.getString("roe"));
				dto.setRoa(resultSet.getString("roa"));
				dto.setUriage_keijo_ratio(resultSet.getString("uriag_keijo_ratio"));
				dto.setUriage_sori_ratio(resultSet.getString("uriage_sori_ratio"));
				dto.setUriage_eigyo_ratio(resultSet.getString("uriage_eigyo_ratio"));
				dto.setTotal_kaiten_ratio(resultSet.getString("total_kaiten_ratio"));
				dto.setZaiko_kaiten_ratio(resultSet.getString("zaiko_kaiten_ratio"));
				dto.setRyudo_ratio(resultSet.getString("ryudo_ratio"));
				dto.setZikoshi_ratio(resultSet.getString("zikoshi_ratio"));
				dto.setKotei_ratio(resultSet.getString("kotei_ratio"));
				dto.setFusai_ratio(resultSet.getString("fusai_ratio"));
				myPageDTO.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return myPageDTO;
	}

	public int keisanResultHistoryDelete(String company_name, String roe, String roa, String uriage_keijo_ratio, String uriage_sori_ratio, String uriage_eigyo_ratio, String total_kaiten_ratio, String zaiko_kaiten_ratio, String ryudo_ratio, String zikoshi_ratio, String kotei_ratio, String fusai_ratio) throws SQLException{
		String sql="DELETE FROM keisan_transaction";
		 DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();
		PreparedStatement preparedStatement;
		int result = 0;
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, company_name);
			preparedStatement.setString(2, roe);
			preparedStatement.setString(3, roe);
			preparedStatement.setString(4, uriage_keijo_ratio);
			preparedStatement.setString(5, uriage_sori_ratio);
			preparedStatement.setString(6, uriage_eigyo_ratio);
			preparedStatement.setString(7, total_kaiten_ratio);
			preparedStatement.setString(8, zaiko_kaiten_ratio);
			preparedStatement.setString(9, ryudo_ratio);
			preparedStatement.setString(10, zikoshi_ratio);
			preparedStatement.setString(11,  kotei_ratio);
			preparedStatement.setString(12, fusai_ratio);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}

	public MyPageDTO getKeisanResultInfo() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}



}