public class Card {
    private String symbol;
    private int num;

    public Card(int num, String symbol){
        this.num = num;
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }
    public int getNum(){
        return num;
    }

public String toString(){
        String result = "";
        result += "Card: " +getNum() + getSymbol();
                return result;
}
}
