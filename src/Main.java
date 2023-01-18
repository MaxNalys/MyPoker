import cards.DeckOfCards;
import players.Player;

public class Main {

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        Table table = new Table();
        Dealer dealer = new Dealer(deckOfCards, table);
        Player player1 = new Player("Max");
        Player player2 = new Player("Vlad");
        Player player3 = new Player("Andrew");
        table.addPlayer(player1);
        table.addPlayer(player2);
        table.addPlayer(player3);
        Poker poker = new Poker(table, dealer);
        poker.startGame();
    }

}