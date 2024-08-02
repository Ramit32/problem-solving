package arrays;

public class CountOfValues {


    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        int[] arr = {-1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        System.out.println("the max count of values is : " + countOfMaxValues(arr, max, min));

        System.out.println("the min count of values is : " + countOfMinValues(arr, min));

    }

    public static int countOfMaxValues(int[] arr, int max, int min) {
        int countOfMax = 0;
        int countOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max && arr[i]!=min) {
                countOfMax = +1;
            }
        }
        return arr.length - countOfMax;
    }

    public static int countOfMinValues(int[] arr, int min) {
        int countOfMax = 0;
        int countOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                countOfMin = countOfMin + 1;
            }
        }
        return countOfMin;
    }
}