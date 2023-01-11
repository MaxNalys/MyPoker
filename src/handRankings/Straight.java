package handRankings;

import cards.Card;

import java.util.ArrayList;

public class Straight {
    public static final int SIZE = 5;

    //1234567
    public static boolean isStraight(ArrayList<Card> cardArrayList) {
        for (int i = 0; i < 3; i++) {
            int checker = 0;
            for (int j = i; j < SIZE + i; j++) {
                if (cardArrayList.get(j).getCardPriority() != cardArrayList.get(j + 1).getCardPriority() + 1) {
                    break;
                }
                checker++;
            }
            if (checker == SIZE) {
                return true;
            }
        }
        return false;

    }
}
