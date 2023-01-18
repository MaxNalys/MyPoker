import cards.Card;
import players.Player;

import java.util.ArrayList;

public class Table {
    private ArrayList<Player> players;
    private ArrayList<Card> cardsOnTable;

    public Table() {
        this.players = new ArrayList<>();
        this.cardsOnTable = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }
}
