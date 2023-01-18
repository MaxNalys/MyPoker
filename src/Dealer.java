import cards.Card;
import cards.DeckOfCards;

import handRankings.*;
import players.Player;
import utils.CardCombinationPriorityComparator;
import utils.CardPriorityComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        determineCardCombination(player, getPlayerAndTableCards(player));
    }

    public void determineCardCombination(Player player, ArrayList<Card> cardArrayList) {
        if (RoyalFlush.isRoyalFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.ROYALFLUSH);
        } else if (StraightFlush.isStraightFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.STRAIGHTFLUSH);
        } else if (FourOfKind.isFourOfKind(cardArrayList)) {
            player.setCardCombination(CardCombination.FOUROFKIND);
        } else if (FullHouse.isFullHouse(cardArrayList)) {
            player.setCardCombination(CardCombination.FULLHOUSE);
        } else if (Flush.isFlush(cardArrayList)) {
            player.setCardCombination(CardCombination.FLUSH);
        } else if (Straight.isStraight(cardArrayList)) {
            player.setCardCombination(CardCombination.STRAIGHT);
        } else if (ThreeOfKind.isKindOfThree(cardArrayList)) {
            player.setCardCombination(CardCombination.THREEOFKIND);
        } else if (TwoPair.isTwoPair(cardArrayList)) {
            player.setCardCombination(CardCombination.TWOPAIR);
        } else if (Pair.isPair(cardArrayList)) {
            player.setCardCombination(CardCombination.PAIR);
        } else {
            player.setCardCombination(CardCombination.HIGHCARD);
        }
    }


    public void determineWinner() {
        for (Player player : table.getPlayers()) {
            player.setCardCombinationPriority(HandRankings.cardPriorityCombination.get(player.getCardCombination()));
        }
        Collections.sort(table.getPlayers(), new CardCombinationPriorityComparator());
        if (table.getPlayers().get(0).getCardCombinationPriority() == table.getPlayers().get(1).getCardCombinationPriority()) {
            determineHighCardWinner();
        } else {
            System.out.println("Winner: " + table.getPlayers().get(0).getName() + " " + table.getPlayers().get(0).getCardCombination().toString());
        }
    }

    public void determineHighCardWinner() {
        ArrayList<Player> highCardPlayer = new ArrayList<>();
        for (Player player : table.getPlayers()) {
            if (player.getCardCombinationPriority() == table.getPlayers().get(0).getCardCombinationPriority()) {
                highCardPlayer.add(player);
            }
        }
        for (int i = 1; i < highCardPlayer.size(); i++) {
            if (highCardPlayer.get(i - 1).getCard1().getCardPriority() == highCardPlayer.get(i).getCard1().getCardPriority()) {
                if (highCardPlayer.get(i - 1).getCard2().getCardPriority() < highCardPlayer.get(i).getCard2().getCardPriority()) {
                    highCardPlayer.remove(i - 1);
                }
            } else if (highCardPlayer.get(i - 1).getCard1().getCardPriority() < highCardPlayer.get(i).getCard1().getCardPriority()) {
                highCardPlayer.remove(i - 1);
            }
        }


        System.out.println("Winner: " + highCardPlayer.get(0).getName() + " " + highCardPlayer.get(0).getCardCombination().toString());

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
