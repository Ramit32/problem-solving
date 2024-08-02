package arrays;

import java.util.Arrays;

public class ProductArrayAlternative {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int N = array.length;
        System.out.println(Arrays.toString(productArrayAlternative(array, N)));
    }

    public static int[] productArrayAlternative(int[] array, int N) {
        int[] prefixArray = prefixProductArray(array, N);
        int[] suffixArray = suffixProductArray(array, N);
        int[] productArray = new int[N];
        //Motive:calculate product array:- {360,240, 180, 144,120}
        for (int i = 0; i <= N - 1; i++) {
            if (i == 0) {
                productArray[i] = suffixArray[i + 1];
            } else if (i == N - 1) {
                productArray[i] = prefixArray[i -1];
            } else {
                productArray[i] = prefixArray[i - 1] * suffixArray[i + 1];
            }
        }
        return productArray;
    }
    //Build prefix product array
    //{2,6,24, 120, 720}
    public static int[] prefixProductArray(int[] array, int N) {
        int[] prefixProductArray = new int[N];
        prefixProductArray[0] = array[0];
        for (int i = 1; i <= N - 1; i++) {
            prefixProductArray[i] = prefixProductArray[i - 1] * array[i];
        }
        return prefixProductArray;
    }
    // Build suffixProductArray from array
    // {720,360,120,30,6}
    public static int[] suffixProductArray(int[] array, int N) {
        int[] suffixProductArray = new int[N];
        suffixProductArray[N - 1] = array[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            suffixProductArray[i] = suffixProductArray[i + 1] * array[i];
        }
        return suffixProductArray;
    }
}
