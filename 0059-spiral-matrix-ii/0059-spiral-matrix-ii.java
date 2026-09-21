class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix=new int[n][n];
        int o=matrix.length;
        int m=matrix[0].length;
        int minr=0;
        int minc=0;
        int maxr=matrix.length -1;
        int maxc=matrix[0].length-1;
        int tne  =o*m;
        int cnt =0;
        int value =1;
        while(cnt<tne) {
            for(int i =minr,j=minc;j<=maxc && cnt<tne;j++){
                matrix[i][j]=value;
                cnt++;
                value++;
            }
            minr++;
            for(int i= minr,j=maxc;i<=maxr && cnt< tne;i++){
                matrix[i][j]=value;
                cnt++;
                value++;
            }
            maxc--;
            for(int i =maxr,j=maxc;j>=minc && cnt < tne;j--){
                matrix[i][j]=value;
                cnt++;
                value++;
            }
            maxr--;
            for(int i =maxr,j=minc;i>=minr && cnt < tne;i--){
                matrix[i][j]=value;
                cnt++;
                value++;
            }
            minc++;
        }
        return matrix;
        
    }
}