package com.internousdev.keisanchan.dto;

public class MyPageDTO {
	public double roe;
	public double roa;
	public double uriage_keijo_ratio;
	public double uriage_sori_ratio;
	public double uriage_eigyo_ratio;
	public double total_kaiten_ratio;
	public double zaiko_kaiten_ratio;
	public double ryudo_ratio;
	public double zikoshi_ratio;
	public double kotei_ratio;
	public double fusai_ratio;


	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}


	public String getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice = totalPrice;
	}


	public String getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount = totalCount;
	}


	public String getPayment(){
		return payment;
	}
	public void setPayment(String payment){
		this.payment = payment;
	}


	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}


	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}


	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

}
