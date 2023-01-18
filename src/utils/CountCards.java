package utils;

import cards.Card;

import java.util.ArrayList;

public class CountCards {
    public static int countCardsByPriority(ArrayList<Card> cardArrayList, int priority) {
        int count=0;
        for (Card card : cardArrayList) {
            if(card.getCardPriority()==priority){
                count++;
            }
        }
        return count;
    }
}
