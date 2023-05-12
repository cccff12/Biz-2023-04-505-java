package blackjeck;

import blackjeck.t2.BlackjackGame;
import blackjeck.t2.Deck;
import blackjeck.t2.Hand;

	// 블랙잭 게임 클래스
	public class game {
	    private Deck deck; // 덱 객체
	    private Hand playerHand; // 플레이어 핸드 객체
	    private Hand dealerHand; // 딜러 핸드 객체

	    public game() {
	        deck = new Deck(); // 덱 초기화
	        playerHand = new Hand(); // 플레이어 핸드 초기화
	        dealerHand = new Hand(); // 딜러 핸드 초기화
	    }

	    public void startGame() {
	        deck.shuffle(); // 덱을 섞음
	        playerHand.clear(); // 플레이어 핸드 비움
	        dealerHand.clear(); // 딜러 핸드 비움

	        // 플레이어와 딜러에게 초기 2장씩 나눠줌
	        for (int i = 0; i < 2; i++) {
	            playerHand.addCard(deck.drawCard());
	            dealerHand.addCard(deck.drawCard());
	        }

	        // 딜러의 첫 번째 카드만 공개
	        System.out.println("딜러의 첫 번째 카드: " + dealerHand.getCards().get(0));
	    }

	    public static void main(String[] args) {
	        BlackjackGame game = new BlackjackGame(); // 블랙잭 게임 객체 생성
	        game.startGame(); // 게임 시작
	    }
	}