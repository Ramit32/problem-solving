package arrays;

import java.util.Arrays;

public class Rotation {



    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int B = 242;
        int N = arr.length;
        B = B%N;

        // reverse the entire array
        int start = 0;
        int end = N-1;
        reverseArray(arr, start, end);

        // reverse the first B elements
        end = B-1;
        reverseArray(arr, start, end);

        // reverse the remaining N-B elements
        start = B;
        end = N-1;
        reverseArray(arr, start, end);
        System.out.println("arr: "+Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end){
        int temp=0;
        temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
    }


    public static int[] reverseArray(int[] arr, int start, int end){

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
}
