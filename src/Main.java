/*
    create two simple arrays two different ways
    implement the for each for one and for loop for the other
    increment through an integer array and display the result
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //===========[Option 1]===========//

        String[] names = new String[3];

        // we can manually add the information to the array
        names[0] = "Avery";
        names[1] = "Otto";
        names[2] = "Emily";

        // in order to display the elements in the array, we need to use Arrays.toString() method
        System.out.println("Some names" + Arrays.toString(names));

        //===========[Option 2]===========//

        // create the array with data inside curly brackets
        String[] moreNames = {"Paul", "Fred", "Harold"};

        System.out.println("More names" + Arrays.toString(moreNames));

        //===========[Iteration of the Arrays]===========//

        // for-each : For Each string name within the names array
        // useful for simple arrays
        System.out.printf("%nPrint the array using a for-each loop%n");
        for(String name : names){
            System.out.println(name);
        }

        // for loop : iterate each element of the array while i <= the length of the array -1
        // can be written as: i <= array.length -1 or i < array.length
        System.out.printf("%nPrint the array using a for loop%n");
        for(int i = 0; i <= moreNames.length -1; i++){
            System.out.println(moreNames[i]);
        }

        //===========[Increment through integers of an array]===========//

        System.out.printf("%nExample of incrementing through " +
                "an array of integers increasing each element by one" +
                ":%n");
        int[] nums = new int[]{1,5,7,8,3,4,0};
        for(int i = 0; i < nums.length; i++){
            nums[i] += 1;
            System.out.print(nums[i] + ", ");
        }
    }
}