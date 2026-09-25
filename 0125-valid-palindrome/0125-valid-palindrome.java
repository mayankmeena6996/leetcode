class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')) {
                sb.append(ch);
            }
        }

        String str = sb.toString();

        return palin(str);
    }

    public boolean palin(String s) {

        int left = 0;
        int right = s.length() - 1;

        boolean palindrome = true;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        return palindrome;
    }
}