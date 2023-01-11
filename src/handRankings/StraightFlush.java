package handRankings;

import cards.Card;

import java.util.ArrayList;

public class StraightFlush {
    public static boolean isStraightFlush(ArrayList<Card> cardArrayList) {
        return Straight.isStraight(cardArrayList) && Flush.isFlush(cardArrayList);
    }
}
