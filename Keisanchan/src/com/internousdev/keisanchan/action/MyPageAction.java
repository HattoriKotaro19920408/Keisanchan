package com.internousdev.keisanchan.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.keisanchan.dao.MyPageDAO;
import com.internousdev.keisanchan.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if (!session.containsKey("id")) {
			return ERROR;
			}
			if(deleteFlg == null) {
		String company_name = session.get("company_name").toString();
		double.parseDouble roe = session.get("roe").toString());
		double.parseDouble  roa= session.get("roa").toString());
		double.parseDouble  uriage_keijo_ratio= session.get("uriage_keijo_ratio").toString());
		double.parseDouble  uriage_sori_ratio= session.get("uriage_sori_ratio").toString());
		double.parseDouble  uriage_eigyo_ratio= session.get("uriage_eigyo_ratio").toString());
		double.parseDouble  total_kaiten_ratio= session.get("total_kaiten_ratio").toString());
		double.parseDouble  zaiko_kaiten_ratio= session.get("zaiko_kaiten_ratio").toString());
		double.parseDouble  ryudo_ratio= session.get("ryudo_ratio").toString());
		double.parseDouble  zikoshi_ratio= session.get("zikoshi_ratio").toString());
		double.parseDouble  kotei_ratio= session.get("kotei_ratio").toString());
		double.parseDouble  fusai_ratio= session.get("fusai_ratio").toString());

		myPageList = myPageDAO.getMyPageUserInfo(company_name, roe, roa, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio);

	}else if(deleteFlg.equals("1")){
		delete();
	}

	String result = SUCCESS;
	return result;
	}
	public void delete()throws SQLException{

		String company_name = session.get("company_name").toString();
		String roa = session.get("roa").toString();
		String  roe= session.get("roe").toString();
		String  uriage_keijo_ratio= session.get("uriage_keijo_ratio").toString();
		String  uriage_sori_ratio= session.get("uriage_sori_ratio").toString();
		String  uriage_eigyo_ratio= session.get("uriage_eigyo_ratio").toString();
		String  total_kaiten_ratio= session.get("total_kaiten_ratio").toString();
		String  zaiko_kaiten_ratio= session.get("zaiko_kaiten_ratio").toString();
		String  ryudo_ratio= session.get("ryudo_ratio").toString();
		String  zikoshi_ratio= session.get("zikoshi_ratio").toString();
		String  kotei_ratio= session.get("kotei_ratio").toString();
		String  fusai_ratio= session.get("fusai_ratio").toString();



		int res = myPageDAO.buyItemHistoryDelete(company_name, roa, roe, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio);

		if(res > 0){
			myPageList = null;
			setMessage("商品情報を正しく削除しました");
		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました");
		}
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}
	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
	public ArrayList<MyPageDTO> getMyPageList(){
		return this.myPageList;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

}
