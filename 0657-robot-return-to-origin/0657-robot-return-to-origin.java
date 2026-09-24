class Solution {
    public boolean judgeCircle(String moves) {
        int v=0;
        int h=0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='R') h++;
            else if(ch=='L')h--;
            else if(ch=='U')v++;
            else v--;
        }
        return v==0&&h==0;
        
    }
}