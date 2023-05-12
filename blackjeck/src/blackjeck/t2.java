package blackjeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class t2 {
	// 카드 클래스
	class Card {
	    private String suit; // 카드의 슈트(하트, 클로버, 스페이드, 다이아몬드)
	    private String rank; // 카드의 랭크(에이스, 2, 3, ..., 킹)

	    public Card(String suit, String rank) {
	        this.suit = suit;
	        this.rank = rank;
	    }

	    public String getSuit() {
	        return suit;
	    }

	    public String getRank() {
	        return rank;
	    }

	    @Override
	    public String toString() {
	        return rank + " " + suit;
	    }
	}

	// 덱 클래스
	class Deck {
	    private List<Card> cards; // 카드 리스트

	    public Deck() {
	        cards = new ArrayList<>(); // 카드 리스트 초기화
	        String[] suits = {"하트", "클로버", "스페이드", "다이아몬드"}; // 슈트 배열
	        String[] ranks = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"}; // 랭크 배열

	        // 슈트와 랭크를 조합하여 52장의 카드를 생성하여 덱에 추가
	        for (String suit : suits) {
	            for (String rank : ranks) {
	                Card card = new Card(suit, rank);
	                cards.add(card);
	            }
	        }
	    }

	    public void shuffle() {
	        Random rand = new Random();

	        // Fisher-Yates 알고리즘을 사용하여 카드를 섞음
	        for (int i = 0; i < cards.size(); i++) {
	            int j = rand.nextInt(cards.size());
	            Card temp = cards.get(i);
	            cards.set(i, cards.get(j));
	            cards.set(j, temp);
	        }
	    }
	    
	    public Card drawCard() {
	        if (cards.isEmpty())
	            return null;

	        // 덱에서 가장 위에 있는 카드를 뽑아서 반환하고, 덱에서 제거
	        return cards.remove(cards.size() - 1);
	    }
	}

	// 핸드 클래스
	class Hand {
	    private List<Card> cards; // 핸드에 들고 있는 카드 리스트

	    public Hand() {
	        cards = new ArrayList<>(); // 핸드의 카드 리스트 초기화
	    }

	    public void addCard(Card card) {
	        cards.add(card); // 카드를 핸드에 추가
	    }

	    public void clear() {
	        cards.clear(); // 핸드의 카드 리스트를 비움
	    }

	    public List<Card> getCards() {
	        return cards; // 핸드의 카드 리스트 반환
	    }
	}

	// 블랙잭 게임 클래스
	public class BlackjackGame {
	    private Deck deck; // 덱 객체
}
}