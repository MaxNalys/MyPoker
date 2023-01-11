import cards.Card;
import cards.DeckOfCards;

import handRankings.*;
import players.Player;
import utils.CardCombinationPriorityComparator;
import utils.CardPriorityComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Table table;
    private DeckOfCards deckOfCards;

    public Dealer(DeckOfCards deckOfCards, Table table) {
        this.deckOfCards = deckOfCards;
        this.table = table;
    }

    public void refreshCardDeck() {
        Collections.shuffle(deckOfCards.getCardsDeck());
    }

    public Card deal() {
        Card card = deckOfCards.getCardsDeck().get(0);
        deckOfCards.getCardsDeck().remove(0);
        deckOfCards.getCardsDeck().add(deckOfCards.getCardsDeck().size() - 1, card);
        return card;
    }

    public void setCardsForPlayers() {
        for (Player player : table.getPlayers()) {
            player.setCard1(deal());
            player.setCard2(deal());
        }
    }

    public void clearPlayerCards() {
        for (Player player : table.getPlayers()) {
            player.setCard1(null);
            player.setCard2(null);
        }
    }

    public ArrayList<Card> getPlayerAndTableCards(Player player) {
        ArrayList<Card> playerAndTableCards = new ArrayList<>();
        playerAndTableCards.addAll(table.getCardsOnTable());
        playerAndTableCards.add(player.getCard1());
        playerAndTableCards.add(player.getCard2());
        sortCardListByPriority(playerAndTableCards);
        return playerAndTableCards;
    }


    public void helper(Player player) {
        determineCardCombination(player,getPlayerAndTableCards(player));
    }

    public void determineCardCombination(Player player, ArrayList<Card> cardArrayList) {
        if (Pair.isPair(cardArrayList)) {
            player.setCardCombination(CardCombination.PAIR);
        } else if (TwoPair.isTwoPair(cardArrayList)) {
            player.setCardCombination(CardCombination.TWOPAIR);
        } else if (RoyalFlush.isRoyalFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.ROYALFLUSH);
        } else if (ThreeOfKind.isKindOfThree(cardArrayList)) {
            player.setCardCombination(CardCombination.THREEOFKIND);
        } else if (Flush.isFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.FLUSH);
        } else if (StraightFlush.isStraightFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.STRAIGHTFLUSH);
        } else if (FullHouse.isFullHouse(cardArrayList)) {
            player.setCardCombination(CardCombination.FULLHOUSE);
        } else if (Straight.isStraight(cardArrayList)) {
            player.setCardCombination(CardCombination.STRAIGHT);
        } else if (FourOfKind.isFourOfKind(cardArrayList)) {
            player.setCardCombination(CardCombination.FOUROFKIND);
        } else {
            player.setCardCombination(CardCombination.HIGHCARD);
        }
    }


    public void determineWinner() {
        for (Player player : table.getPlayers()) {
            player.setCardCombinationPriority(HandRankings.cardPriorityCombination.get(player.getCardCombination()));
        }

        Collections.sort(table.getPlayers(), new CardCombinationPriorityComparator());
        System.out.println("Winner: " + table.getPlayers().get(0).getName() + " " + table.getPlayers().get(0).getCardCombination().toString());
    }

    public void setCardForTable() {
        table.getCardsOnTable().add(deal());
    }

    public void clearTable() {
        table.getCardsOnTable().clear();
    }

    public void sortCardListByPriority(ArrayList<Card> cardArrayList) {
        Collections.sort(cardArrayList, new CardPriorityComparator());
    }
}
