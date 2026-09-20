class Solution {
    public int largestAltitude(int[] gain) {
        int m=0;
        int k =0;
        for(int i =0;i<gain.length;i++){
            k+=gain[i];
            m=Math.max(m,k);
        }
        return m;
        
    }
}