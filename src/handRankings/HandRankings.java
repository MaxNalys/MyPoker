package handRankings;

import java.util.HashMap;
import java.util.Map;

public class HandRankings {
    public static final Map<Enum, Integer> cardPriorityCombination;

    static {
        cardPriorityCombination = new HashMap<>();
        cardPriorityCombination.put(CardCombination.ROYALFLUSH,1);
        cardPriorityCombination.put(CardCombination.STRAIGHTFLUSH,2);
        cardPriorityCombination.put(CardCombination.FOUROFKIND,3);
        cardPriorityCombination.put(CardCombination.FULLHOUSE,4);
        cardPriorityCombination.put(CardCombination.FLUSH,5);
        cardPriorityCombination.put(CardCombination.STRAIGHT,6);
        cardPriorityCombination.put(CardCombination.THREEOFKIND,7);
        cardPriorityCombination.put(CardCombination.TWOPAIR,8);
        cardPriorityCombination.put(CardCombination.PAIR,9);
        cardPriorityCombination.put(CardCombination.HIGHCARD,10);
    }
}
