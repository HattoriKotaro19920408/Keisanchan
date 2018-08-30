package com.internousdev.keisanchan.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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



	@SuppressWarnings("unused")
	public String execute() throws SQLException {
		MyPageDAO myPageDao = new MyPageDAO();
		List<MyPageDTO> myPageDtoList = new ArrayList<MyPageDTO>();
//		myPageDtoList = myPageDao.getKeisanResultInfo(String.valueOf(session.get("loginUserId")));
		Iterator<MyPageDTO> iterator = myPageDtoList.iterator();
		if(!(iterator.hasNext())){
		    myPageDtoList = null;
		}
		session.put("myPageDtoList", myPageDtoList);


		String result = ERROR;
		if (session.containsKey("loginUserId")) {
			result = SUCCESS;
		}

		if(deleteFlg == null) {
			String login_id = session.get("login_id").toString();
			String company_name = session.get("company_name").toString();
			String roe = (session.get("roe").toString());
			String roa = (session.get("roa").toString());
			String uriage_keijo_ratio =(session.get("uriage_keijo_ratio").toString());
			String uriage_sori_ratio =(session.get("uriage_sori_ratio").toString());
			String uriage_eigyo_ratio =(session.get("uriage_eigyo_ratio").toString());
			String total_kaiten_ratio =(session.get("total_kaiten_ratio").toString());
			String zaiko_kaiten_ratio =(session.get("zaiko_kaiten_ratio").toString());
			String ryudo_ratio =(session.get("ryudo_ratio").toString());
			String zikoshi_ratio =(session.get("zikoshi_ratio").toString());
			String kotei_ratio =(session.get("kotei_ratio").toString());
			String fusai_ratio =(session.get("fusai_ratio").toString());
			myPageList = (ArrayList<MyPageDTO>) myPageDAO.getKeisanResultInfo(login_id, company_name, roe, roa, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio);
		} else if(deleteFlg.equals("1")) {
					delete();

		}
		session.put("myPageDtoList", myPageList);


		return result;
	}




//	MyPageDAO myPageDao = new MyPageDAO();
//	List<MyPageDTO> myPageDtoList = new ArrayList<MyPageDTO>();
//	myPageDtoList = myPageDao.getMyPageList(String.valueOf(session.get("loginId")));
//	Iterator<MyPageDTO> iterator = myPageDtoList.iterator();
//	if(!(iterator.hasNext())) {
//		myPageDtoList = null;
//	}


	public void delete()throws SQLException{
		String login_id = session.get("loin_id").toString();
		String company_name = session.get("company_name").toString();
		String roe = (session.get("roe").toString());
		String roa = (session.get("roa").toString());
		String uriage_keijo_ratio =(session.get("uriage_keijo_ratio").toString());
		String uriage_sori_ratio =(session.get("uriage_sori_ratio").toString());
		String uriage_eigyo_ratio =(session.get("uriage_eigyo_ratio").toString());
		String total_kaiten_ratio =(session.get("total_kaiten_ratio").toString());
		String zaiko_kaiten_ratio =(session.get("zaiko_kaiten_ratio").toString());
		String ryudo_ratio =(session.get("ryudo_ratio").toString());
		String zikoshi_ratio =(session.get("zikoshi_ratio").toString());
		String kotei_ratio =(session.get("kotei_ratio").toString());
		String fusai_ratio =(session.get("fusai_ratio").toString());



		int res = myPageDAO.keisanResultHistoryDelete(login_id, company_name, roa, roe, uriage_keijo_ratio, uriage_sori_ratio, uriage_eigyo_ratio, total_kaiten_ratio, zaiko_kaiten_ratio, ryudo_ratio, zikoshi_ratio, kotei_ratio, fusai_ratio);

		if(res > 0){
			myPageList = null;
			setMessage("計算履歴情報を正しく削除しました");
		}else if(res == 0){
			setMessage("計算履歴情報の削除に失敗しました");
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