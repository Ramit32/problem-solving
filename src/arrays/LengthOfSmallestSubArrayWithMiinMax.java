package arrays;

public class LengthOfSmallestSubArrayWithMiinMax {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 9, 8, 7, 6, 9, 2, 2};
        int[] array2 = {8, 8, 8, 8, 8, 8, 8, 8, 8};
        System.out.println(lengthOfSmallestSubArrayWithMinMax(array));
        System.out.println(lengthOfSmallestSubArrayWithMinMax(array2));
    }

    public static int lengthOfSmallestSubArrayWithMinMax(int[] array) {
        int N = array.length;
        int min = min(array, N);
        int max = max(array, N);
        int ans = N;
        for (int i = 0; i < N; i++) {
            if (array[i] == min) {

                for (int j = i; j < N; j++) {
                    if (array[j] == max) {
                        ans = Math.min(ans, j - i + 1);
                        break;
                    }

                }
            } else if (array[i] == max) {
                for (int j = i; j < N; j++) {
                    if (array[j] == min) {
                        ans = Math.min(ans, j - i + 1);
                        break;
                    }

                }

            }

        }
        return ans;
    }

    public static int min(int[] array, int N) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array, int N) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
