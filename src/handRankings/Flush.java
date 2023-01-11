package handRankings;

import cards.Card;
import cards.CardSuit;

import java.util.ArrayList;

public class Flush {
    public static final int SIZE = 5;

//??
    public static boolean isFlush(ArrayList<Card> cardArrayList) {
        int pikes = 0;
        int clovers = 0;
        int hearts = 0;
        int tiles = 0;
        for (int i = 0; i < cardArrayList.size(); i++) {
            if (cardArrayList.get(i).getCardSuit().equals(CardSuit.CLOVERS)) {
                clovers++;
            } else if (cardArrayList.get(i).getCardSuit().equals(CardSuit.HEARTS)) {
                hearts++;
            } else if (cardArrayList.get(i).getCardSuit().equals(CardSuit.TILES)) {
                tiles++;
            } else {
                pikes++;
            }
        }
        return clovers >= 5 || hearts >= 5 || tiles >= 5 || pikes >= 5;
    }
}
