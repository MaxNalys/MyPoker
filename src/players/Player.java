package players;

import cards.Card;

public class Player {
    private String name;
    private int bank;
    private Card card1;
    private Card card2;
    private Enum cardCombination;
    private int cardCombinationPriority;

    public Player(String name) {
        this.name = name;
        this.bank = 500;
        this.card1 = null;
        this.card2 = null;
        this.cardCombination = null;
        this.cardCombinationPriority=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getCardCombination() {
        return cardCombination;
    }

    public int getCardCombinationPriority() {
        return cardCombinationPriority;
    }

    public void setCardCombinationPriority(int cardCombinationPriority) {
        this.cardCombinationPriority = cardCombinationPriority;
    }

    public void setCardCombination(Enum cardCombination) {
        this.cardCombination = cardCombination;
    }

    public String getName() {
        return name;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getBank() {
        return bank;
    }

    public Card getCard2() {
        return card2;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    public Card getCard1() {
        return card1;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }


}
