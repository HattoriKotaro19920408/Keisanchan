package com.internousdev.keisanchan.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.keisanchan.dao.LoginDAO;
import com.internousdev.keisanchan.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();


	public String execute(){
		String result = ERROR;
		System.out.println("----LoginAction");
		System.out.println(loginUserId);

		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUserId",loginDTO);

		if(session.containsKey("loginUserId")){
			session.put("login_id", loginUserId);
			System.out.println(session.get("login_id").toString());
			System.out.println("-------------------");
		}

		if(((LoginDTO)session.get("loginUserId")).getLoginFlg()){
			result = SUCCESS;


			return result;
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

    @Override
    public void setSession(Map<String, Object> session) {
    this.session = session;
}

	public Map<String, Object> getSession() {
		return session;
	}

}