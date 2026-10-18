class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            int n = ans.size();

            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(nums[i]);

                if (!ans.contains(temp)) {
                    ans.add(temp);
                }
            }
        }

        return ans;
    }
}

