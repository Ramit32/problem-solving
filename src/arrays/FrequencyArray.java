package arrays;

public class FrequencyArray {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 3, 32, 1, 1, 1, 3, 2, 3, -1, -1, -4, 9};
        int value =0;
        System.out.println("the frequency of value in the array is: "+frequencyCalculator(array,value));


    }

    public static int frequencyCalculator(int[] array, int value) {
        int frequency =0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i]==value){
                frequency=frequency+1;
            }
        }
        return frequency;

    }

}
