package arrays;

import java.util.Arrays;

public class LeftMax {

    public static void main(String[] args) {
        int[] array = {8, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        System.out.println(Arrays.toString(leftMaxArray(array)));
    }

    public static int[] leftMaxArray(int[] array) {
        int N = array.length;
        int[] leftMaxArray = new int[N];
        leftMaxArray[0] = array[0];
        for (int i = 1; i <= N - 1; i++) {
            leftMaxArray[i] = Math.max(leftMaxArray[i-1], array[i]);
        }
        return leftMaxArray;
    }


}
