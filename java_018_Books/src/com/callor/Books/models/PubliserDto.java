package com.callor.Books.models;

public class PubliserDto {
	private String pubCode;
	private String pubName;
	private String pubCeo;
	private String pubTel;
	private String pubAddress;
	
	
	public PubliserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PubliserDto(String pubCode, String pubName, String pubCeo, String pubTel, String pubAddress) {
		super();
		this.pubCode = pubCode;
		this.pubName = pubName;
		this.pubCeo = pubCeo;
		this.pubTel = pubTel;
		this.pubAddress = pubAddress;
	}
	@Override
	public String toString() {
		return "PubliserDto [pubCode=" + pubCode + ", pubName=" + pubName + ", pubCeo=" + pubCeo + ", pubTel=" + pubTel
				+ ", pubAddress=" + pubAddress + "]";
	}
	public String getPubCode() {
		return pubCode;
	}
	public void setPubCode(String pubCode) {
		this.pubCode = pubCode;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getPubCeo() {
		return pubCeo;
	}
	public void setPubCeo(String pubCeo) {
		this.pubCeo = pubCeo;
	}
	public String getPubTel() {
		return pubTel;
	}
	public void setPubTel(String pubTel) {
		this.pubTel = pubTel;
	}
	public String getPubAddress() {
		return pubAddress;
	}
	public void setPubAddress(String pubAddress) {
		this.pubAddress = pubAddress;
	}

}
