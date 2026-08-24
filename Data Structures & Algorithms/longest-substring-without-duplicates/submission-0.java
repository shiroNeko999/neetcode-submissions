class Solution {
    public int lengthOfLongestSubstring(String s) {
        //[xxxx]
        HashSet<Character> seen = new HashSet<>();
        int l = 0; int r = 0;
        int count = 0;
        while(l<=r && r< s.length()){
            char ch = s.charAt(r);
            while(seen.contains(ch)){
                seen.remove(s.charAt(l));// keep shrinking the window till no duplicate
                l++;
            }
            
            seen.add(ch);
            count = Math.max(count,r-l+1);
            r++;
        }
       

        return count;
        
    }
}
