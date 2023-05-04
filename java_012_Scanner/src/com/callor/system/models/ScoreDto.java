package com.callor.system.models;

public class ScoreDto {

	private String stNum;
	private int scKor;
	private int scEng;
	private int scMatg;
	private int scMusic;
	private int scArt;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
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
	public int getScMatg() {
		return scMatg;
	}
	public void setScMatg(int scMatg) {
		this.scMatg = scMatg;
	}
	public int getScMusic() {
		return scMusic;
	}
	public void setScMusic(int scMusic) {
		this.scMusic = scMusic;
	}
	public int getScArt() {
		return scArt;
	}
	public void setScArt(int scArt) {
		this.scArt = scArt;
	}
	@Override
	public String toString() {
		return "ScoreDto [stNum=" + stNum + ", scKor=" + scKor + ", scEng=" + scEng + ", scMatg=" + scMatg
				+ ", scMusic=" + scMusic + ", scArt=" + scArt + "]";
	}
	// getter setter, tostring 까지가 Dto의 기본 세팅이다.
}
