public class Card implements Comparable{
    public static final String[] RANK = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
    public static final String[] SUIT = {"♡", "♤", "♧", "♢"};
    private String value;
    private String suit;

    public Card(String aValue, String aSuit){
        value = aValue;
        suit = aSuit;
    }

    public String getSuit(){
        return suit;
    }

    public String getValue(){
        return value;
    }

    public int compareTo(Object obj){
        Card other = (Card) obj;
        return this.getRankValue() - other.getRankValue();

    }

    public int getRankValue(){
        for (int i = 0; i < RANK.length; i++){
            if (this.value.equals(RANK[i])){
                return 14 - i;
            }
        }
        return -1;
    }

    public String toString(){
        String result = "";
        result += suit;
        result += value + "| ";
        return result;
    }

    public static void main(String[] args) {
        Card c = new Card(RANK[0], SUIT[0]);
        System.out.println(c);
    }
}
