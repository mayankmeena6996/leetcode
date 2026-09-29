class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        String[] s1 = s.split(" ");

        String m = s1[s1.length - 1];

        int count = m.length();

        return count;
    }
}