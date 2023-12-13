import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] primes = SieveOfEratosthenes(10000005);
        System.out.println("5000th prime number is " + primes[4999]);
    }

    private static int[] SieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Counting primes in the range
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                count++;
            }
        }

        // Storing prime numbers in an array
        int[] primes = new int[count];
        int index = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                primes[index++] = p;
            }
        }

        return primes;
    }
}