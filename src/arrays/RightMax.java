package arrays;

import java.util.Arrays;

public class RightMax {

    public static void main(String[] args) {
        int[] array = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        System.out.println(Arrays.toString(rightMaxArray(array)));
    }
    public static int[] rightMaxArray(int[] array) {
        int N = array.length;
        int max = 0;
        int[] rightMaxArray = new int[N];
        rightMaxArray[N-1] = array[N-1];
        for (int i = N-2; i >= 0; i--) {
            rightMaxArray[i] = Math.max(rightMaxArray[i+1], array[i]);
        }
        return rightMaxArray;
    }
}
