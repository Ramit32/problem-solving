package arrays;

import java.util.Arrays;

public class HighestFrequencyInArray {


    public static void main(String[] args) {

        int[] array = {0, 1, 1, 3, 3, 3, 3, 5};
        System.out.println("the highest frequency of value in the array is: " + frequencyCalculator(array));
    }

    public static int frequencyCalculator(int[] array) {
        Arrays.sort(array);
        int finalMaxFrequency = 0;
        int initialMaxFrequency = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) {
                initialMaxFrequency += 1;
            }else{
                initialMaxFrequency = 1;
            }
            if (initialMaxFrequency > finalMaxFrequency) {
                finalMaxFrequency = initialMaxFrequency;
            }

        }
        return finalMaxFrequency;
}
}
