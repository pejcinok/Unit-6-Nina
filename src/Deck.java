import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (String rank : Card.RANK) {
            for (String suit : Card.SUIT) {
                deck.add(new Card(rank, suit));

            }
        }
    }
            public void shuffle(){
                    int r;
                for (int i =0; i<deck.size(); i++) {
                    r = (int) Math.random() * (1 + i);
                    Card temp = deck.get(i);
                    deck.set(i, deck.get(r));
                    deck.set(r, temp);

                }

        }
        public ArrayList<Card> getDeck() {
            return deck;
        }

        public String toString(){
        return deck.toString();
        }

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.toString());
        d.shuffle();
        System.out.println(d.getDeck());
    }
}


