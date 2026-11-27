class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        boolean[] found = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            found[nums[i]] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!found[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}