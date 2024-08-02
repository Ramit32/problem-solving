package arrays;

import java.util.Arrays;

public class RotationRightArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int B = 2;
        int N = arr.length;
        B = B % N;

        // Reverse the array
        int start = 0; //0
        int end = N - 1;//5
        reverseArray(arr, start, end);


        //reverse the first N-B elements
        end = N-B-1;//6-2=4
        reverseArray(arr, start, end);

        //reverse the remaining B elements
        start = N - B;// 6-2=4
        end = N-1;//6
        reverseArray(arr, start, end);
        System.out.println("arr: " + Arrays.toString(arr));

    }

    public static void swap(int[] arr, int start, int end) {
        int temp = 0;
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static int[] reverseArray(int[] arr, int start, int end) {

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

}
