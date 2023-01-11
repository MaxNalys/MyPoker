package handRankings;

import cards.Card;

import java.util.ArrayList;

public class ThreeOfKind {

    public static boolean isKindOfThree(ArrayList<Card> cardArrayList) {
        for (int i = 0; i < cardArrayList.size(); i++) {
            int checker=0;
            for (int j = i; j < cardArrayList.size(); j++) {
                if(cardArrayList.get(i).getCardPriority()==cardArrayList.get(j).getCardPriority()){
                    checker++;
                }
            }
            if(checker==3){
                return true;
            }
        }
        return false;
    }
}
