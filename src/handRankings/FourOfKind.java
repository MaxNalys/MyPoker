package handRankings;

import cards.Card;

import java.util.ArrayList;

public class FourOfKind {

    public static boolean isFourOfKind(ArrayList<Card> cardArrayList) {
        for (int i = 0; i < cardArrayList.size(); i++) {
            int checker=0;
            for (int j = i; j < cardArrayList.size(); j++) {
                if(cardArrayList.get(i).getCardPriority()==cardArrayList.get(j).getCardPriority()){
                    checker++;
                }
            }
            if(checker==4){
                return true;
            }
        }
        return false;
    }
}
