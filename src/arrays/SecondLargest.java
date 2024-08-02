package arrays;

import java.util.Arrays;

public class SecondLargest {


    public static void main(String[] args) {
        //int[] array ={1,2,3,32,4};
        int[] array = {1};

        System.out.println("the value of second largest is "+secondLargest(array));

    }

    public static int secondLargest(int[] array){
        Arrays.sort(array);
        int N = array.length;

        if(N<=1){
            return -1;
        }

        int secondlargest=0;
        for (int i= array.length-1; i>=0;i--){

            if(array[i]!=array[i-1]){
                secondlargest=array[i-1];
                break;
            }

        }
        return secondlargest;
    }


}
