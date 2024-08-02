package arrays;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args){
        int[] array2={0,1,2,3,4,5};
        ReverseTheArray reverse =new ReverseTheArray();

        System.out.println("the reverse order is: "+ Arrays.toString(reverse.goReverse(array2)));
        System.out.println("the reverse order when time complexity is handled: "+ Arrays.toString(reverse.goReverseTime(array2)));
    }

    public int[] goReverse(int[] array){

        int n=array.length;
        int[] arrayBucket=new int[n];

        for(int i=n-1; i>=0; i--){
            arrayBucket[n-1-i]=array[i];
        }
        return arrayBucket;
    }

    public int[] goReverseTime(int[] array){

        int a;
        int n= array.length;
        int start=0;

        for(int i=0; i<n/2; i++){

            a=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=a;
        }
        return array;
    }

    public static int[] reverseArray(int[] arr){
        int start= 0;
        int end= arr.length-1;
        while(start<end){

            int temp=0;
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
        }
        return arr;
    }

}
