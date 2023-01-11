import cards.DeckOfCards;
import players.Player;

public class Poker {
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
    Table table;
    Dealer dealer;


    public Poker(Table table, Dealer dealer) {
        this.table = table;
        this.dealer = dealer;
    }

    public void startGame() {
        dealer.refreshCardDeck();
        dealer.setCardsForPlayers();
        dealer.setCardForTable();
        dealer.setCardForTable();
        dealer.setCardForTable();
        dealer.setCardForTable();
        dealer.setCardForTable();


        PrintCard.printCards(table.getCardsOnTable().get(0));
        PrintCard.printCards(table.getCardsOnTable().get(1));
        PrintCard.printCards(table.getCardsOnTable().get(2));
        PrintCard.printCards(table.getCardsOnTable().get(3));
        PrintCard.printCards(table.getCardsOnTable().get(4));
        System.out.println("");
        for (Player player : table.getPlayers()) {
            System.out.print(WHITE_BOLD_BRIGHT + player.getName());
            PrintCard.printCards(player.getCard1());
            PrintCard.printCards(player.getCard2());
            System.out.println("");
        }
        for (Player player : table.getPlayers()) {
            dealer.helper(player);
        }
        dealer.determineWinner();

    }

}
