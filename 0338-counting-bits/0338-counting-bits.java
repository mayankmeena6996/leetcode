
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int k = 0; k <= n; k++) {
            int count = 0;
            int temp = k;

            while (temp > 0) {
                count++;
                temp = temp & (temp - 1);
            }

            arr[k] = count;
        }

        return arr;
    }
}
