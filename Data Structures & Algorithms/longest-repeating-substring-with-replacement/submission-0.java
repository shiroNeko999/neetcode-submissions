class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] freq = new int[26];
        for( int right = 0; right< s.length(); right++ ){
            char ch = s.charAt(right);
            ++freq[ch-'A'];
            maxFreq = Math.max( maxFreq, freq[ch-'A']);

            int replacementNeeded = (right-left+1)- maxFreq;

            // this is just to shrink the window
            while(replacementNeeded>k){
                --freq[s.charAt(left)-'A'];
                left++;
                replacementNeeded = (right-left+1)- maxFreq;
            }

            maxLength = Math.max( maxLength, (right-left+1));
        }
        return maxLength;
    }
}
