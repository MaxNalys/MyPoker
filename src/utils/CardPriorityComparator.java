package utils;

import cards.Card;

import java.util.Comparator;

public class CardPriorityComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o2.getCardPriority() - o1.getCardPriority();
    }
}
