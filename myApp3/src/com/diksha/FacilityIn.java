package com.diksha;

public class FacilityIn {
	
	
	
	private int accno;
	private int paybal; 
	private String Dateofpay; 
	private String paytype; 
	private String Provider;
	public FacilityIn(int accno, int paybal, String dateofpay, String paytype, String provider) {
		super();
		this.accno = accno;
		this.paybal = paybal;
		Dateofpay = dateofpay;
		this.paytype = paytype;
		Provider = provider;
	}
	
	
	public FacilityIn() {
		super();
	}


	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPaybal() {
		return paybal;
	}
	public void setPaybal(int paybal) {
		this.paybal = paybal;
	}
	public String getDateofpay() {
		return Dateofpay;
	}
	public void setDateofpay(String dateofpay) {
		Dateofpay = dateofpay;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getProvider() {
		return Provider;
	}
	public void setProvider(String provider) {
		Provider = provider;
	}
	
	
	
	

}
