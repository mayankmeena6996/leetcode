class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            int m =nums[i];
            while(m!=0){
                m=m/10;
                count2++;
            }
            if(count2%2==0){
                count1++;
            }
            else{
                count2=0;
            }
        }
        return count1;
        
    }
}