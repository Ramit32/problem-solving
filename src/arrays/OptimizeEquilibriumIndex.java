package arrays;

public class OptimizeEquilibriumIndex {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8, 10};
        System.out.println(isOptimizeEquilibrium(array));
    }


    public static boolean isOptimizeEquilibrium(int[] array) {
        int[] prefixArray = new int[array.length];
        int N = array.length;
        prefixArray[0]=array[0];
        for (int i = 1; i <=N - 1; i++) {

            prefixArray[i] = prefixArray[i - 1] + array[i];


        }

        int sumLeft =0;
        int sumRight = 0;

        for (int i = 0; i <array.length - 1; i++) {

            if (i == 0) {
                sumLeft = 0;
                sumRight = prefixArray[N - 1] - prefixArray[i];
            }
            else if(i == array.length-1){
                sumRight=0;
                sumLeft = prefixArray[i-1];
            }else{
                sumLeft = prefixArray[i-1];
                sumRight= prefixArray[N-1]-prefixArray[i];
            }
            if(sumLeft==sumRight){
                return true;
            }
        }
        return false;
    }


}
