import java.util.ArrayList;
import java.util.List;

class Card {
    private String suit;
    private String rank;

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

public class Main {
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

        // 생성된 카드 출력
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}