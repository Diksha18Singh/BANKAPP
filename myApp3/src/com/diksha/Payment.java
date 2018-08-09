package com.diksha;

public class Payment {
	
	
	private int accno;
	private int payba; 
	private String Dateofpay; 
	private String paytype; 
	private String Provider;
	public Payment(int accno, int payba, String dateofpay, String paytype, String provider) {
		super();
		this.accno = accno;
		this.payba = payba;
		Dateofpay = dateofpay;
		this.paytype = paytype;
		Provider = provider;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPayba() {
		return payba;
	}
	public void setPayba(int payba) {
		this.payba = payba;
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
