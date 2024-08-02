package arrays;

public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8, 10};
        System.out.println(isEquilibriumIndex(array));

    }

    public static boolean isEquilibriumIndex(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (i == 0) {
                    sumLeft = 0;
                } else {
                    sumLeft += array[j];
                }
            }
            for (int j = i + 1; j <= array.length - 1; j++) {

                if (i == array.length - 1) {
                    sumRight = 0;
                } else {
                    sumRight += array[j];
                }

            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

}
