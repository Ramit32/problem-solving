package arrays;

import java.util.Arrays;

public class TimeToEquality {

    public static void main(String[] args) {

        int[] array={1,2,4,3,2};

        System.out.println(timeToEquality(array));

    }
    public static int timeToEquality(int[] array){

        int n = array.length;
        int max=0;
        int time=0;

        for(int i =0;i<n; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        for(int i=0; i<n; i++){
            if(array[i]!=max){

                time+=max-array[i];

            }
        }
        return time;
    }



}
