package arrays;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {

        int[] array = {-3, 1, 3, 4, 6, 5, 7, -9, 8, 7, 2};
        System.out.println(Arrays.toString(prefixSum(array)));

    }

    public static int[] prefixSum(int[] array) {
        int[] prefixArray = new int[array.length];
        prefixArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {

            prefixArray[i] = prefixArray[i - 1] + array[i];

        }
        return prefixArray;
    }


}
