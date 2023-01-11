package handRankings;

import cards.Card;

import java.util.ArrayList;

public class RoyalFlush {
    public static final int SIZE = 5;

    RoyalFlush() {
    }

    public static boolean isRoyalFlush(ArrayList<Card> cardArrayList) {
        int cardPriorityChecker = 15;
        for (int i = 0; i < SIZE; i++) {
            cardPriorityChecker--;
            if (cardArrayList.get(i).getCardPriority() != cardPriorityChecker) {
                return false;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            if (cardArrayList.get(i - 1).getCardSuit() != cardArrayList.get(i).getCardSuit()) {
                return false;
            }
        }
        return true;
    }
}
