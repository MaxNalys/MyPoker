package utils;

import players.Player;
import java.util.Comparator;

public class CardCombinationPriorityComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getCardCombinationPriority() - o2.getCardCombinationPriority();
    }
}
