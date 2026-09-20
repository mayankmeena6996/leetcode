class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image[0].length];
        int row= 0;
        int col =0;
        for (int i = 0; i < image.length; i++) {
            for (int j = image[0].length - 1; j >= 0; j--) {
                ans[row][col] = image[i][j];
                col++;
            }
            row++;
            col = 0;
        }
        for(int i=0;i<image.length;i++){
            for(int j =0;j<image[i].length;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}