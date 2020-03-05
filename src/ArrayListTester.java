import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTester {
    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 0, 0, 1, 4, 0, 6, 0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Person objects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();


        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());


    }

    public static void removeZeros(ArrayList list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).equals(0)) {
                list.remove(i);
                i--;

            }
            i++;
        }


    }
    //2. Write a method named countLetters that is passed an ArrayList parameter named list that contains String object references. The method must count up & return the number of characters (letters, digits, blank spaces, etc.) in all of the strings of list.
    //Example: list = ["hello", "my", "name", "is", "Mr. Smith“] returns 22 (includes period symbol and blank space)
    public static int countLetters(ArrayList<String> list) {
        int i = 0;
        int count =0;
        while (i < list.size()) {
            count += list.get(i).length();

            i++;


    }
       return count;
    }
//3. Write a method named findPosition that accepts two parameters, an int named keyValue and an array list of Integer's named list. The method must return the first subscript position within list in which keyValue is found. If keyValue is not stored in list, return the value -1.
   // Example: keyValue = 3 & list = {4, 8, 3, 2, 3} 2 would be returned Example#2: keyValue = 5 & list = {4, 8, 3, 2, 3} -1 would be returned

    public static int findPosition(int KeyValue, ArrayList<Integer> list){
        for(int i =0; i<list.size(); i++){
            if(list.get(i).equals(KeyValue)){
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<String> parseIntoArrayList(String input){
        ArrayList<String> separated = new ArrayList<String>();
        for(int i =0; i<input.length(); i++){
            separated.add(i, input.substring(i,i+1));
        }
        return separated;
    }
    public static String findMin(ArrayList<Person> people){
        int min =0;
        int count =0;
        for (int i =0; i<people.size(); i++){
            if (min < people.get(i).getAge()){
                min = people.get(i).getAge();
                 count ++;
            }
        }
        return people.get(count).getName();
    }


        }


