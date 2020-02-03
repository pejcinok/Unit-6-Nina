import java.util.Scanner;

public class FrequencyChart {
    //class stuff
    //instance variables
    private int[] list;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;
    private int count6;
    private int count7;
    private int count8;
    private int count9;
    private int count10;

    public FrequencyChart(int[] list) {
        this.list = list;
    }

    public String makeChart() {
        String result = "";
        result += "1-10   |" +  printStars(count1) +"\n";
        result += "11-20   |" + printStars(count2) +"\n";
        result += "21-30   |" + printStars(count3) +"\n";
        result += "31-40   |" + printStars(count4) +"\n";
        result += "41-50   |" + printStars(count5) +"\n";
        result += "51-60   |" + printStars(count6) +"\n";
        result += "61-70   |" + printStars(count7) +"\n";
        result += "71-80   |" + printStars(count8) +"\n";
        result += "81-90   |" + printStars(count9) +"\n";
        result += "91-100  |" + printStars(count10) +"\n";

        return result;

    }


    public void countStars() {
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        count5 = 0;
        count6 = 0;
        count7 = 0;
        count8 = 0;
        count9 = 0;
        count10 = 0;
        for (int n : list) {
            if (n >= 1 && n <= 10)
                count1++;
            if (n > 10 && n <= 20)
                count2++;
            if (n > 20 && n <= 30)
                count3++;
            if (n > 30 && n <= 40)
                count4++;
            if (n > 40 && n <= 50)
                count5++;
            if (n > 50 && n <= 60)
                count6++;
            if (n > 60 && n <= 70)
                count7++;
            if (n > 70 && n <= 80)
                count8++;
            if (n > 80 && n <= 90)
                count9++;
            if (n > 90 && n <= 100)
                count10++;
        }
    }

    private String printStars(int starCount) {
            String result = "";
            for (int i = 0; i< starCount; i++){
                result +="*";
            }
                return result;
        }




    //end class stuff

    // main method to make the chart
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("enter data values one at a time followed by enter: ");
        int val = 0;

        for (int i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        chart.countStars();

        System.out.println(chart.makeChart());
    }

}


