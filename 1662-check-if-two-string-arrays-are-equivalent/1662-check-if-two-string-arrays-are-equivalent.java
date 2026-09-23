class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s :word1){
            sb.append(s);
        }
        for(String s1 :word2){
            sb2.append(s1);
        }
        if(sb.toString().equals(sb2.toString())){
            return true;
        }
        else{
            return false;
        }
        
    }
}