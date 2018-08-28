package com.internousdev.keisanchan.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.keisanchan.dao.KeisanResultDAO;
import com.internousdev.keisanchan.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class KeisanResultAction extends ActionSupport implements SessionAware{

	private String company_name;
	private double roe;
	private double roa;
	private double uriage_keijo_ratio;
	private double uriage_sori_ratio;
	private double uriage_eigyo_ratio;
	private double total_kaiten_ratio;
	private double zaiko_kaiten_ratio;
	private double ryudo_ratio;
	private double zikoshi_ratio;
	private double kotei_ratio;
	private double fusai_ratio;



	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String,Object> session;


	public String execute() throws SQLException{

//		String result = ERROR;



		 String.valueOf(roe);
		 String.valueOf(roa);
		 String.valueOf(uriage_keijo_ratio);
		 String.valueOf(uriage_sori_ratio);
		 String.valueOf(uriage_eigyo_ratio);
		 String.valueOf(total_kaiten_ratio);
		 String.valueOf(zaiko_kaiten_ratio);
		 String.valueOf(ryudo_ratio);
		 String.valueOf(zikoshi_ratio);
		 String.valueOf(kotei_ratio);
		 String.valueOf(fusai_ratio);



		KeisanResultDAO keisanResultDAO = new KeisanResultDAO();
		keisanResultDAO.keisan(((LoginDTO)session.get("loginUserId")).getLoginUserId(),
				session.get("company_name").toString(),
				session.get("roe").toString(),
				session.get("roa").toString(),
				session.get("uriage_keijo_ratio").toString(),
				session.get("uriage_sori_ratio").toString(),
				session.get("uriage_eigyo_ratio").toString(),
				session.get("total_kaiten_ratio").toString(),
				session.get("zaiko_kaiten_ratio").toString(),
				session.get("ryudo_ratio").toString(),
				session.get("zikoshi_ratio").toString(),
				session.get("kotei_ratio").toString(), session.get("fusai_ratio").toString());
//		List<KeisanResultDTO> keisanResultDtoList = new ArrayList<KeisanResultDTO>();
//		keisanResultDtoList = keisanResultDAO.getKeisanResultList(String.valueOf(session.get("roe")));
//		keisanResultDAO.keisan(session.get("company_name").toString(),
//				Double.parseDouble(session.get("roe").toString()),
//				Double.parseDouble(session.get("roa").toString()),
//				Double.parseDouble(session.get("uriage_keijo_ratio").toString()),
//				Double.parseDouble(session.get("uriage_sori_ratio").toString()),
//				Double.parseDouble(session.get("uriage_eigyo_ratio").toString()),
//				Double.parseDouble(session.get("total_kaiten_ratio").toString()),
//				Double.parseDouble(session.get("zaiko_kaiten_ratio").toString()),
//				Double.parseDouble(session.get("ryudo_ratio").toString()),
//				Double.parseDouble(session.get("zikoshi_ratio").toString()),
//				Double.parseDouble(session.get("kotei_ratio").toString()),
//				Double.parseDouble(session.get(" fusai_ratio").toString()));

//		    String a = String.valueOf(123.45);  ダブル型をストリングに変換
String result = SUCCESS;
return result;




//		int count = keisanResultDAO.keisan(company_name,
//				roe,
//				roa,
//				uriage_keijo_ratio,
//				uriage_sori_ratio,
//				uriage_eigyo_ratio,
//				total_kaiten_ratio,
//				zaiko_kaiten_ratio,
//				ryudo_ratio,
//				zikoshi_ratio,
//				kotei_ratio,
//				fusai_ratio);
//
//		if(count > 0){
//			result = SUCCESS;
//		}
//		return result;

	}


	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public double getRoa() {
		return roa;
	}

	public void setRoa(double roa) {
		this.roa = roa;
	}

	public double getRoe() {
		return roe;
	}

	public void setRoe(double roe) {
		this.roe = roe;
	}

	public double getUriage_keijo_ratio() {
		return uriage_keijo_ratio;
	}

	public void setUriage_keijo_ratio(double uriage_keijo_ratio) {
		this.uriage_keijo_ratio = uriage_keijo_ratio;
	}

	public double getUriage_sori_ratio() {
		return uriage_sori_ratio;
	}

	public void setUriage_sori_ratio(double uriage_sori_ratio) {
		this.uriage_sori_ratio = uriage_sori_ratio;
	}

	public double getUriage_eigyo_ratio() {
		return uriage_eigyo_ratio;
	}

	public void setUriage_eigyo_ratio(double uriage_eigyo_ratio) {
		this.uriage_eigyo_ratio = uriage_eigyo_ratio;
	}

	public double getTotal_kaiten_ratio() {
		return total_kaiten_ratio;
	}

	public void setTotal_kaiten_ratio(double total_kaiten_ratio) {
		this.total_kaiten_ratio = total_kaiten_ratio;
	}

	public double getZaiko_kaiten_ratio() {
		return zaiko_kaiten_ratio;
	}

	public void setZaiko_kaiten_ratio(double zaiko_kaiten_ratio) {
		this.zaiko_kaiten_ratio = zaiko_kaiten_ratio;
	}

	public double getRyudo_ratio() {
		return ryudo_ratio;
	}

	public void setRyudo_ratio(double ryudo_ratio) {
		this.ryudo_ratio = ryudo_ratio;
	}

	public double getZikoshi_ratio() {
		return zikoshi_ratio;
	}

	public void setZikoshi_ratio(double zikoshi_ratio) {
		this.zikoshi_ratio = zikoshi_ratio;
	}

	public double getKotei_ratio() {
		return kotei_ratio;
	}

	public void setKotei_ratio(double kotei_ratio) {
		this.kotei_ratio = kotei_ratio;
	}

	public double getFusai_ratio() {
		return fusai_ratio;
	}

	public void setFusai_ratio(double fusai_ratio) {
		this.fusai_ratio = fusai_ratio;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
