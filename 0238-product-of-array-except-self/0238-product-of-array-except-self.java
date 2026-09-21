class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int u = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = u;
            u *= nums[i];
        }
        u = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            ans[i] *= u;
            u *= nums[i];
        }
        return ans;
    }
}