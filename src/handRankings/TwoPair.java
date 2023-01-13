package handRankings;

import cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class TwoPair {

    public static boolean isTwoPair(ArrayList<Card> cardArrayList) {
        int checker = 0;
        for (int i = 1; i < cardArrayList.size(); i++) {
            if (cardArrayList.get(i - 1).getCardPriority() == cardArrayList.get(i).getCardPriority()) {
                checker++;
            }
        }
        return checker == 2;
    }

}
