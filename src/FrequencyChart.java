import java.util.Scanner;

public class FrequencyChart {
    //class stuff
    //instance variables
    private int[] list;

    public FrequencyChart(int[] list){
       this.list = list;
    }

    public String makeChart(){
        String result = "";
        result += "1-10  |" + star1 + "\n";
        result += "11-20 |" + elevenTwenty() +"\n";



        return result;
    }

    //helper methods
    public String oneTen(){
        String star1 ="";
        String star2 ="";
        String star3 = "";
        String star4 = "";
        String star5 ="";
        String star6 ="";
        String star7 ="";
        String star8 = "";
        String star9 = "";
        String star10 ="";

        for (int i = 0; i<list.length; i++) {
            if (i <= 10 && i >= 1) {
                star1 += "*";
            }
            if (i<=20 && i>=11){
                star2+="*";
        }
        return star;
    }

    public String elevenTwenty(){
        String star ="";
        for (int i = 0; i<list.length; i++)


            }
        return star;
    }

    public String twentyThirty(){
        String star ="";
        for (int i = 0; i<list.length; i++)
            if (i<=20 && i>11){
                star+="*";

            }
        return star;
    }

    //end class stuff

    // main method to make the chart
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("how many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("enter data values one at a time followed by enter: ");
        int val = 0;

        for (int i =0; i<data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
    }
}
