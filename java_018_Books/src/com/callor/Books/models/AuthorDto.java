package com.callor.Books.models;

public class AuthorDto {

	private String auCode;
	private String auName;
	private String auTel;
	private String auAddress;
	
	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthorDto(String auCode, String auName, String auTel, String auAdress) {
		super();
		this.auCode = auCode;
		this.auName = auName;
		this.auTel = auTel;
		this.auAdress = auAdress;
	}
	public String getAuCode() {
		return auCode;
	}
	public void setAuCode(String auCode) {
		this.auCode = auCode;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public String getAuTel() {
		return auTel;
	}
	public void setAuTel(String auTel) {
		this.auTel = auTel;
	}
	public String getAuAdress() {
		return auAdress;
	}
	public void setAuAdress(String auAdress) {
		this.auAdress = auAdress;
	}
	@Override
	public String toString() {
		return "AuthorDto [auCode=" + auCode + ", auName=" + auName + ", auTel=" + auTel + ", auAdress=" + auAdress
				+ "]";
	}
	
}
