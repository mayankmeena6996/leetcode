
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int k = 0;
            int num = i;

            while (num != 0) {
                num = num & (num - 1);
                k++;
            }

            if (isPrime(k)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
