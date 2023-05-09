package com.callor.classes.models;

public class ScoreDto {

	private String stName;
	private int scKor;
	private int scEng;
	private int scMath;
	
	public ScoreDto(String stName, int scKor, int scEng, int scMath) { //임의생성자
		super();
		this.stName = stName;
		this.scKor = scKor;
		this.scEng = scEng;
		this.scMath = scMath;
	}
	
	
	public ScoreDto() { // 기본생성자
		super();
		// TODO Auto-generated constructor stub
	}






	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScEng() {
		return scEng;
	}
	public void setScEng(int scEng) {
		this.scEng = scEng;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	@Override
	public String toString() {
		return "ScoreDto [stName=" + stName + ", scKor=" + scKor + ", scEng=" + scEng + ", scMath=" + scMath + "]";
	}
	
	
	
	
	
	
	
}
