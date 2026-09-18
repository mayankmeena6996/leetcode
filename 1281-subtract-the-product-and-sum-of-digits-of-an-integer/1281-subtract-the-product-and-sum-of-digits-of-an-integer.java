class Solution {
    public int subtractProductAndSum(int n) {
        int m=0;
        int p=1;
        while(n!=0){
            m+=n%10;
            p*=n%10;
            n=n/10;
        }
        int result=p-m;
        return result;
        
    }
}