package handRankings;

import cards.Card;

import java.util.ArrayList;

public class Straight {
    public static final int SIZE = 5;

    //10JQKA66
    //245678
    public static boolean isStraight(ArrayList<Card> cardArrayList) {
        for (int i = 0; i < 3; i++) {
            int card1 = cardArrayList.get(i).getCardPriority();
            int card2 = cardArrayList.get(i + 1).getCardPriority() + 1;
            int card3 = cardArrayList.get(i + 2).getCardPriority() + 2;
            int card4 = cardArrayList.get(i + 3).getCardPriority() + 3;
            int card5 = cardArrayList.get(i + 4).getCardPriority() + 4;
            return (card1 == card2 && card1 == card2 && card1 == card3 && card1 == card4 && card1 == card5);
        }
        return false;

    }
}
