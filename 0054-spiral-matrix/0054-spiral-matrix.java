class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result =new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int minr=0;
        int minc=0;
        int maxr=matrix.length -1;
        int maxc=matrix[0].length-1;
        int tne  =n*m;
        int cnt =0;
        while(cnt<tne) {
            for(int i =minr,j=minc;j<=maxc && cnt<tne;j++){
                result.add(matrix[i][j]);
                cnt++;
            }
            minr++;
            for(int i= minr,j=maxc;i<=maxr && cnt< tne;i++){
                result.add(matrix[i][j]);
                cnt++;
            }
            maxc--;
            for(int i =maxr,j=maxc;j>=minc && cnt < tne;j--){
                result.add(matrix[i][j]);
                cnt++;
            }
            maxr--;
            for(int i =maxr,j=minc;i>=minr && cnt < tne;i--){
                result.add(matrix[i][j]);
                cnt++;
            }
            minc++;
        }
        return result;
    }
}