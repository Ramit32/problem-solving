package arrays;

public class MaxMinOptimize {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 6, 9, 9, 2, 3, 1};
        int[] array2 = {8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        int N = array2.length;
        System.out.println(minLengthCalaculate(array2, N));

    }

    public static int minLengthCalaculate(int[] array, int N) {
        int minValue = min1(array, N);
        int maxValue = max1(array, N);
        int lastMax = -1;
        int lastMin = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (array[i] == minValue) {

                lastMin = i;

            }
            if (array[i] == maxValue) {

                lastMax = i;

            }
            if (lastMax != -1 && lastMin != -1) {

                int length = Math.abs(lastMax - lastMin) + 1;
                if (ans > length) {

                    ans = length;

                }
            }

        }
        return ans;


    }

    public static int min1(int[] array, int N) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max1(int[] array, int N) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


}
