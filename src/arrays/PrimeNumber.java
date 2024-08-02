package arrays;

public class PrimeNumber {


    public static void main(String[] args) {
        int N = 100;
        System.out.println(isPrime(N));
    }

    public static boolean isPrime(int N) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    count += 1;
                } else {
                    count += 2;
                }


            }

        }
        System.out.println(count);
        if (count == 2) {
            return true;
        } else return false;

    }


}
