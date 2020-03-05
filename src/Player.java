import java.util.ArrayList;

public class Player {
    private int id;
    private ArrayList<Card> hand;
    private Deck theDeck;

    public Player(int id, Deck deck){
        theDeck = deck;
        this.id = id;
        hand = new ArrayList<Card>();
    }

    public void draw(){
        hand.add(theDeck.getDeck().remove(0));

    }

    public void inHand(int cardsInHand){
        for (int i =0; i< cardsInHand; i++ ){
            draw();
        }

    }

    public String toString(){
        return "Player " + id + ": " + hand;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d.getDeck());
        Player p1 = new Player(1, d);
        Player p2 = new Player(2, d);
        p1.inHand(7);
        p2.inHand(7);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(d.getDeck());
    }
}
