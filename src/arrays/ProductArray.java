package arrays;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("the product array is : " + Arrays.toString(productArray(array)));
    }

    public static int[] productArray(int[] array) {
        int N = array.length;
        int product = 1;
        int[] productArray = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            product = product * array[i];
        }
        for (int i = 0; i <= N - 1; i++) {
            productArray[i] = product / array[i];
        }
        return productArray;
    }
}
