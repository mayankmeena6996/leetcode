class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int l=nums[0];
        if(nums.length==0){
            return count;
        }
        count++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[count-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
        
    }
}