package cards;

import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> cardsDeck;

    public DeckOfCards() {
        this.cardsDeck = new ArrayList<>();
        setUp();
    }

    public ArrayList<Card> getCardsDeck() {
        return cardsDeck;
    }

    private void setUp() {
        addAce(CardSuit.HEARTS);
        addAce(CardSuit.CLOVERS);
        addAce(CardSuit.PIKES);
        addAce(CardSuit.TILES);
        addKing(CardSuit.HEARTS);
        addKing(CardSuit.CLOVERS);
        addKing(CardSuit.PIKES);
        addKing(CardSuit.TILES);
        addQueen(CardSuit.HEARTS);
        addQueen(CardSuit.CLOVERS);
        addQueen(CardSuit.PIKES);
        addQueen(CardSuit.TILES);
        addJack(CardSuit.HEARTS);
        addJack(CardSuit.CLOVERS);
        addJack(CardSuit.PIKES);
        addJack(CardSuit.TILES);
        addTen(CardSuit.HEARTS);
        addTen(CardSuit.CLOVERS);
        addTen(CardSuit.PIKES);
        addTen(CardSuit.TILES);
        addNine(CardSuit.HEARTS);
        addNine(CardSuit.CLOVERS);
        addNine(CardSuit.PIKES);
        addNine(CardSuit.TILES);
        addEight(CardSuit.HEARTS);
        addEight(CardSuit.CLOVERS);
        addEight(CardSuit.PIKES);
        addEight(CardSuit.TILES);
        addSeven(CardSuit.HEARTS);
        addSeven(CardSuit.CLOVERS);
        addSeven(CardSuit.PIKES);
        addSeven(CardSuit.TILES);
        addSix(CardSuit.HEARTS);
        addSix(CardSuit.CLOVERS);
        addSix(CardSuit.PIKES);
        addSix(CardSuit.TILES);
        addFive(CardSuit.HEARTS);
        addFive(CardSuit.CLOVERS);
        addFive(CardSuit.PIKES);
        addFive(CardSuit.TILES);
        addFour(CardSuit.HEARTS);
        addFour(CardSuit.CLOVERS);
        addFour(CardSuit.PIKES);
        addFour(CardSuit.TILES);
        addThree(CardSuit.HEARTS);
        addThree(CardSuit.CLOVERS);
        addThree(CardSuit.PIKES);
        addThree(CardSuit.TILES);
        addTwo(CardSuit.HEARTS);
        addTwo(CardSuit.CLOVERS);
        addTwo(CardSuit.PIKES);
        addTwo(CardSuit.TILES);
    }

    private void addAce(CardSuit cardSuit) {
        Ace ace = new Ace(cardSuit);
        cardsDeck.add(ace);
    }

    private void addKing(CardSuit cardSuit) {
        King king = new King(cardSuit);
        cardsDeck.add(king);
    }

    private void addQueen(CardSuit cardSuit) {
        Queen queen = new Queen(cardSuit);
        cardsDeck.add(queen);
    }

    private void addJack(CardSuit cardSuit) {
        Jack jack = new Jack(cardSuit);
        cardsDeck.add(jack);
    }

    private void addTen(CardSuit cardSuit) {
        Ten ten = new Ten(cardSuit);
        cardsDeck.add(ten);
    }

    private void addNine(CardSuit cardSuit) {
        Nine nine = new Nine(cardSuit);
        cardsDeck.add(nine);
    }

    private void addEight(CardSuit cardSuit) {
        Eight eight = new Eight(cardSuit);
        cardsDeck.add(eight);
    }

    private void addSeven(CardSuit cardSuit) {
        Seven seven = new Seven(cardSuit);
        cardsDeck.add(seven);
    }

    private void addSix(CardSuit cardSuit) {
        Six six = new Six(cardSuit);
        cardsDeck.add(six);
    }

    private void addFive(CardSuit cardSuit) {
        Five five = new Five(cardSuit);
        cardsDeck.add(five);
    }

    private void addFour(CardSuit cardSuit) {
        Four four = new Four(cardSuit);
        cardsDeck.add(four);
    }

    private void addThree(CardSuit cardSuit) {
        Three three = new Three(cardSuit);
        cardsDeck.add(three);
    }

    private void addTwo(CardSuit cardSuit) {
        Two two = new Two(cardSuit);
        cardsDeck.add(two);
    }
}
