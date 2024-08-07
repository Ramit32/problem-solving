package arrays;

import java.util.Arrays;

public class FindingLeader {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        int N = array.length;
        System.out.println(Arrays.toString(findLeader(array, N)));
    }

    public static int[] findLeader(int[] array, int N) {
        int[] leaders = new int[N];
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                leaders[j] = max;
                j++;
            }
        }
        int[] output = new int[j];

        for (int i = 0; i < j; i++) {

            output[i]=leaders[j-i-1];

        }
        return output;

    }

}
