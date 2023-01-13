package handRankings;


import cards.Card;
import utils.CountCards;

import java.util.ArrayList;

public class Pair {

    public static boolean isPair(ArrayList<Card> cardArrayList) {
        for(Card card:cardArrayList){
            if(CountCards.countCardsByPriority(cardArrayList,card.getCardPriority())==2){
                return true;
            }
        }
        return false;
    }
}
