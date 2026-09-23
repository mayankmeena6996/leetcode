class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder(s);
        int l = s.length();
        for(int i = 0; i < l; i++) {
            char vh = sb.charAt(i);
            ans.setCharAt(indices[i], vh);
        }
        return ans.toString();
    }
}