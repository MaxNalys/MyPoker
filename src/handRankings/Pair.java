package handRankings;


import cards.Card;

import java.util.ArrayList;

public class Pair {


    public static boolean isPair(ArrayList<Card> cardArrayList) {
        int pair=0;
        for (int i = 0; i < cardArrayList.size(); i++) {
            for (int j = i + 1; j < cardArrayList.size(); j++) {
                if (cardArrayList.get(i).getCardPriority() == cardArrayList.get(j).getCardPriority()) {
                 pair++;
                }
            }
        }
        return pair == 1;
    }
}
