package com.internousdev.keisanchan.action;

import com.opensymphony.xwork2.ActionSupport;

public class keisanAction extends ActionSupport{

	private double toki;
	private double zikoshi;
	private double keijo;
	private double uriage;
	private double uriage_sori;
	private double eigyo;
	private double total_assets;
	private double uriage_saiken;
	private double uriage_genka;
	private double tana;
	private double ryudo_assets;
	private double ryudo_fusai;
	private double kotei_assets;
	private double total_fusai;

	public double getToki(){
		return this.toki;
	}
	public double getZikoshi(){
		return this.zikoshi;
	}
	public double getKeijo(){
		return this.keijo;
	}
	public double getUriage(){
		return this.uriage;
	}
	public double getUriage_sori(){
		return this.uriage_sori;
	}
	public double getEigyo(){
		return this.eigyo;
	}
	public double getTotal_assets(){
		return this.total_assets;
	}
	public double getUriagesaiken(){
		return this.uriage_saiken;
	}
	public double getUriage_genka(){
		return this.uriage_genka;
	}
	public double getTana(){
		return this.tana;
	}
	public double getRyudo_assets(){
		return this.ryudo_assets;
	}
	public double getRyudo_fusai(){
		return this.ryudo_fusai;
	}
	public double getKotei_assets(){
		return this.kotei_assets;
	}
	public double getTotal_fusai(){
		return this.total_fusai;
	}


}
