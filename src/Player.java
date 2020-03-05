import java.util.ArrayList;

public class Player {
    private int id;
    private ArrayList<Card> hand;
    private Deck theDeck;
    public Player(int id, Deck deck){
        theDeck = deck;
        this.id = id;
    }
}
