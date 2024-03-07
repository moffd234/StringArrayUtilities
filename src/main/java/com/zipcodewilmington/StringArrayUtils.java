package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {
        return Arrays.toString(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);

        return reversedArray == array;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */
    public static boolean isPangramic(String[] array) {
        for (char c = 'a'; c <= 'z'; ++c) {
            String stringC = Character.toString(c);

            // Checks both uppercase and lowercase
            if(!contains(array, stringC) && !contains(array, stringC.toUpperCase())){
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */
    public static int getNumberOfOccurrences(String[] array, String value) {
        int total = 0;
        for(String i : array){
            if((i.equals(value))){
                total += 1;
            }
        }
        return total;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<>();
        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                newArray.add(i);
            }
        }
        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();
        for(int i = 0; i < array.length - 1; i++){
            if(!array[i].equals(array[i + 1])){
                newArray.add(array[i]);
            }
        }
        newArray.add(array[array.length-1]);
        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
