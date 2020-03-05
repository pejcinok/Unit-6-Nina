
import java.util.ArrayList;

public class Purse {

    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        int total = 0;
        for (int i = 0; i < coins.size(); i++) {
            total += coins.get(i).getValue();
            System.out.println(total);;
        }
        return total;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int count = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).equals(aCoin) == true) {
                count++;
            }
        }
        return count;
    }

    public String findSmallest() {
        double min = 30000000;
        int index = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (this.coins.get(i).getValue() < min) {
                min = coins.get(i).getValue();
                index++;
            }


        }
        return coins.get(index).getName();

    }
}
