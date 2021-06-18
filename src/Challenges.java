import java.util.ArrayList;
import java.util.Arrays;

public class Challenges {
    /**
     * Create a function which returns the number of true values there are in an array.
     *
     * @return
     */
    public static int countTrueFalse(boolean[] arr) {
        //hold the integer to create a count
        int count = 0;
        // loop through the array (arr)
        for (boolean element : arr) {
            // if the current element is true increase or count
            if (element) count++;
        }
        //return the count
        return count;

        //remember to come back and look at this code


        // 1. we can start with a loop ;note that the Boolean determines how many times a statement can execute
        // 2. then choose a loop that best matches the situation-
        // 3. booleans are best used to define a loop that starts a true or false line define those lines that you see and look at the test file for CountTrue for help on choosing the right path
        // Note :return zero if any empty given array ;all array items are of the type bool (true or false)
    }

    /**
     * Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.
     */
    public static int differenceMinMax(int[] nums) {
       /*
       two line solution
       Arrays.sort( nums);
       return Math.abs( nums[0] - nums[nums.length-1]);
        */
        int highest = nums[0];
        int lowest = nums[0];
        // loop through nums and
        for (int num : nums) {
            //see if each element is bigger than the biggest
            if (num > highest) {
                highest = num;
            }
            // or smaller than the smallest
            if (num < lowest) {
                lowest = num;
            }
        }
        // return the absolute difference (taking off a neg. and building a pos.)- put in abs ;Math.abs

        return Math.abs(highest - lowest);
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str) {
        String result = str.substring(0, 2) + "... " + str.substring(0, 2) + "... " + str + "?";
        // how to get to the first two character in the string; char?
        return result;
    }

    /**
     * Write a function that takes an array of numbers and returns the second largest number.
     */
    public static int secondLargestNumber(int[] nums) {
        // sort array from smallest to largest
        Arrays.sort(nums);
        // find and return second largest number
        return nums[nums.length - 2];
        //int[] arr = {1,2,7,9}
        // I know that I should start with int ; int will mainly be used through out the function that create
        // or Integer
        // the second largest number must be returned


    }

    /**
     * FizzBuzz
     * Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     * If the number is a multiple of 3 the output should be "Fizz".
     * If the number given is a multiple of 5, the output should be "Buzz".
     * If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     * If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     * The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num) {
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }


        // if num is divisible by 3 and 5 the output should be "FizzBuz"
        //if num is divisible by 3 the output should be "Fizz"
        // if num is divisible by 5 the output should be "Buzz"
        return String.valueOf(num);
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy) {
        // count from the first number to the second number in increments of three
        int countfrom;


        if (countTo < countFrom) {
            return "Try again with better numbers!";
            //valid user input ; "Try again with better numbers
        }
        StringBuilder answer = new StringBuilder();
        // create a pattern. pattern is based on user input basis
        for (int i = countFrom; i <= countTo; i += countBy) {
            answer.append(i).append(".. ");
        }
        return answer.toString();
    }

    /**
     * The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.
     */
    public static String reverser(String reverseMe) {

// then create a method that can return in a reverse order
//            reverseMe = "";
        String reverse = "";
        String alphaBeta = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < reverseMe.length(); i++) {
            if (alphaBeta.contains(reverseMe.charAt(i) + (""))) {
                reverse =  (reverseMe.charAt(i) +  ("")).toLowerCase() +reverse;
            }
            else{reverse =  (reverseMe.charAt(i) +  ("")).toUpperCase()+reverse;

            }
        }


        // return in reverse order using and opposite case
        // return the string
        return reverse;
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr) {
        // function that reverses the order of any array
        //reverse the array
        // make sure that the tests are checked to match up with the code
        //
        return new int[0];
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     *
     * @return
     */
    public static String duckTheBomb(String checkMe) {
        //look at the code FizzBuzz for help or to check for verification only difference is that this
        // is labeled as a string and the other is labeled as an int
        // the function must find the word bomb


        int intIndex = checkMe.toLowerCase().indexOf("bomb");
        ///if {bomb   return "Duck!";
        if (intIndex == -1) {
            return "Relax, there's no bomb.";


        }
        return "DUCK!";
    }

    /**
     * Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static void sortNumsAscending(int[] nums) {
        //put into ascending order
        // create a method that takes in and return that new array from smallest to biggest
        // if the function argument is null, then return and empty and undefined array

        //take another look before clarifying the answer
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] stringArray) {
        int removesDups = 0;
        // look at every and every element in the array
        ArrayList<String> cleanlist = new ArrayList<>();
        for (String each : stringArray) {
            //what value they hold and have we all ready seen this value
            if (!cleanlist.contains(each)) {
                //if not set it aside and hold it
                cleanlist.add(each);
            }
        }
        //return all of the held values
        return cleanlist.toArray(new String[0]);
    }
}