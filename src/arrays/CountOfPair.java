package arrays;

public class CountOfPair {

    public static void main(String[] args) {
        String s = "bcadegag";
        System.out.println("the count is: " + countOfPair(s));
    }

    public static int countOfPair(String s) {
        int N = s.length();
        int count = 0;

        for (int i = 0; i <= N - 1; i++) {

            if (s.charAt(i) == 'a') {

                for (int j = i + 1; j <= N - 1; j++) {

                    if (s.charAt(j) == 'g') {
                        count++;
                    }

                }

            }

        }
        return count;

    }

}
