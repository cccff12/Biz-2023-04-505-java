package com.callor.blackjack.models;

/*
 * BlackJack에서 사용하는 4벌의 suit와 : 다이아 하트 스페이드 클로버
 *  13가지 denomination값을 가진다: 국자, 알파벳으로 구성(A는 1, 그외 알파벳은 10으로 설정)
 * 총 52매의 카드를 가지고 사용한다(조커제외)
 * 
 * => playing card
 */

public class CardDto {

	public String suit;
	public String denomination;
	public int value;

//	매개변수가 없는 기본생성자
	public CardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	필드변수와 같은 매개변수를 갖는 임의 생성자(필드생성자)
	public CardDto(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}

	public String toString() {
		return "CardDto [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}

	public String[] getPattern() {
		String[] patterns= {
				String.format("	┌────────┐"),
				String.format("	│     %1s  │",this.suit),
				String.format("	│        │"),
				String.format("	│    %2s  │",this.denomination),
				String.format("	└────────┘"),
				
		
		};
		return patterns;
	}
	
	
	
}
