package handRankings;

import cards.Card;

import java.util.ArrayList;

public class FullHouse {

    public static boolean isFullHouse(ArrayList<Card> cardArrayList) {
        return ThreeOfKind.isKindOfThree(cardArrayList) && Pair.isPair(cardArrayList);
    }
}
