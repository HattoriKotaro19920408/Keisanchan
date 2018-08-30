package com.internousdev.keisanchan.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.keisanchan.dao.MyPageDAO;
import com.internousdev.keisanchan.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("id")){
			MyPageDAO myPageDAO = new MyPageDAO();
			MyPageDTO myPageDTO = myPageDAO.getKeisanResultInfo();
			session.put("login_id", myPageDTO.getLogin_id());
			session.put("company_name", myPageDTO.getCompany_name());
			session.put("roe",myPageDTO.getRoe());
			session.put("roa",myPageDTO.getRoa());
			session.put("uriage_keijo_ratio",myPageDTO.getUriage_keijo_ratio());
			session.put("uriage_sori_ratio",myPageDTO.getUriage_sori_ratio());
			session.put("uriage_eigyo_ratio",myPageDTO.getUriage_eigyo_ratio());
			session.put("total_kaiten_ratio",myPageDTO.getTotal_kaiten_ratio());
			session.put("zaiko_kaiten_ratio",myPageDTO.getZaiko_kaiten_ratio());
			session.put("ryudo_ratio",myPageDTO.getRyudo_ratio());
			session.put("zikoshi_ratio",myPageDTO.getZikoshi_ratio());
			session.put("kotei_ratio",myPageDTO.getKotei_ratio());
			session.put("fusai_ratio",((MyPageDTO) myPageDTO).getFusai_ratio());
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

}