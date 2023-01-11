package cards;

public class Card {
    private CardSuit cardSuit;
   private int cardPriority;

    public Card( int cardPriority) {
        this.cardPriority = cardPriority;
    }

    public Card(CardSuit cardSuit, int cardPriority) {
        this.cardSuit = cardSuit;
        this.cardPriority = cardPriority;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int getCardPriority() {
        return cardPriority;
    }
}
