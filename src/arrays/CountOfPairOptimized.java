package arrays;

public class CountOfPairOptimized {

    public static void main(String[] args) {
        String s = "bcdeaaggaffg";
        System.out.println(countOfPairOptimized(s));
    }

    public static int countOfPairOptimized(String s) {
        int N = s.length();
        int count = 0;
        int ans = 0;
        for (int i = 0; i <= N - 1; i++) {

            if (s.charAt(i) == 'a') {

                count++;


            } else if (s.charAt(i)=='g') {
                ans = ans+count;
            }
        }
        return ans;

    }

}
