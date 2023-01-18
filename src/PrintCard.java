import cards.Card;
import java.util.HashMap;

public class PrintCard {
    public static HashMap<Integer, String> cardIdentifiers;
    public static final String blackColor = "\033[1;90m"; // BLACK
    public static final String blackColorForPikes = "\033[1;30m";  // BLACK
    public static final String redColor = "\033[1;31m";    // RED


    static {
        cardIdentifiers = new HashMap<>();
        cardIdentifiers.put(14, "A");
        cardIdentifiers.put(13, "K");
        cardIdentifiers.put(12, "Q");
        cardIdentifiers.put(11, "J");
        cardIdentifiers.put(10, "10");
        cardIdentifiers.put(9, "9");
        cardIdentifiers.put(8, "8");
        cardIdentifiers.put(7, "7");
        cardIdentifiers.put(6, "6");
        cardIdentifiers.put(5, "5");
        cardIdentifiers.put(4, "4");
        cardIdentifiers.put(3, "3");
        cardIdentifiers.put(2, "2");
    }

    public static void printCards(Card card) {
        switch (card.getCardSuit()) {
            case PIKES:
                System.out.print(" " + blackColorForPikes + cardIdentifiers.get(card.getCardPriority())+"♠");
                break;
            case HEARTS:
                System.out.print(" " + redColor + cardIdentifiers.get(card.getCardPriority())+"♥");
                break;
            case CLOVERS:
                System.out.print(" " + blackColor + cardIdentifiers.get(card.getCardPriority())+"♣");
                break;
            case TILES:
                System.out.print(" " + redColor + cardIdentifiers.get(card.getCardPriority())+"♦");
                break;
            default:
                System.out.print("Error");
                break;
        }
    }
}
