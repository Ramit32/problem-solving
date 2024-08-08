
//Given an array A, for which the ith element is the price of the given stack on day i. If you were permitted to complete at most one transaction(i.e buy one and sell one share of the stock). Write a program to find maximum profit.
package arrays;

public class MaximumStockProfit {

    public static void main(String[] args) {
        int[] array = {5, 9, 2, 4, 1, 8, 7, 6, 4, 0};
        int N = array.length;
        System.out.println(maximumStockProfit(array, N));
    }

    public static int maximumStockProfit(int[] array, int N) {
        int minSoFar = Integer.MAX_VALUE;
        int tempProfit;
        int maxProfit = 0;
        for (int i = 0; i < N; i++) {

            if (array[i] < minSoFar) {
                minSoFar = array[i];
            }
            tempProfit = array[i] - minSoFar;
            if (maxProfit < tempProfit) {

                maxProfit = tempProfit;

            }

        }
        return maxProfit;
    }


}
