package handRankings;

import cards.Card;
import utils.CountCards;

import java.util.ArrayList;

public class FullHouse {

    public static boolean isFullHouse(ArrayList<Card> cardArrayList) {
       if(ThreeOfKind.isKindOfThree(cardArrayList)){
           for(Card card:cardArrayList){
               if(CountCards.countCardsByPriority(cardArrayList,card.getCardPriority())==2){
                   return true;
               }
           }
       }
       return false;
    }
}
