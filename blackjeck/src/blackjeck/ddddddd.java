package blackjeck;

import java.util.ArrayList;
import java.util.List;

class Card {
	private String num; // 카드의 숫자
	private String suit;// 카드의 문양

	public Card(String s, String r) {
		this.num = s;
		this.suit = r;

	}

	public String getSuit() {
		return suit;
	}

	public String getnum() {
		return num;
	}

	public static void main(String[] args) {
		List<Card> deck = new ArrayList<>();
		String[] suits = {"하트", "클로버", "스페이드", "다이아몬드"};
        String[] ranks = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
        
        
        
		
	}

}
