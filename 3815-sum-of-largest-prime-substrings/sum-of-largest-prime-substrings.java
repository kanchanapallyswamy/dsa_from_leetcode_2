import java.util.*;

class Solution {
    public long sumOfLargestPrimes(String s) {
        Set<Long> primeSet = new HashSet<>();

        // Generate all substrings and check for primality
        for (int i = 0; i < s.length(); i++) {
            long num = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (!primeSet.contains(num) && isPrime(num)) {
                    primeSet.add(num);
                }
            }
        }

        // Sort primes in descending order
        List<Long> primes = new ArrayList<>(primeSet);
        primes.sort(Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < Math.min(3, primes.size()); i++) {
            sum += primes.get(i);
        }

        return sum;
    }

    private boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
