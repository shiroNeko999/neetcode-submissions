class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        // increase the index of each character in the first letter then decrease it , if any character goes below zero then game over 
        if(s.length()!= t.length()){
            return false;
        }

        for( int i = 0;i<s.length();i++){
            ++freq[s.charAt(i)-'a'];
        }

        for( int i = 0;i<t.length();i++){
            if(--freq[t.charAt(i)-'a'] <0 ){
            return false;
            }        
        }
        return true;
    }
}
