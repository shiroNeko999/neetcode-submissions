class Solution {
    public String minWindow(String s, String t) {
        // s should be greater than t 
        if(s.length()< t.length())
        return "";
        //create freq map for t
        Map<Character, Integer> window = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();

        for(int i = 0; i< t.length();i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i),0)+1);
        }
        int start = 0; int l = 0; int minLen = Integer.MAX_VALUE;
        for( int r =0; r< s.length();r++){
            char ch = s.charAt(r);
            //do the operation on window with the new right character
            window.put(ch, window.getOrDefault(ch,0)+1);
            while( matches(window,need))// shrink the window till matches becomes false , which means till window becomes invalid
            {
                // find the length of the window 
                int len = r-l+1;
                // minLen = len if its the minimum and start = l
                if(len < minLen){
                    minLen = len ;
                    start = l;
                }
                // eject the left character from the window start , and decrease it frequency
                char leftChar= s.charAt(l);
                window.put(leftChar, window.getOrDefault(leftChar,0)-1);//removed from window 
                l++;//move ahead , shrink the window
            }            
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return  s.substring(start,start+minLen);
    
    }

    private boolean matches(Map<Character,Integer>window, Map<Character,Integer>need){
        for( char ch : need.keySet()){
            int required = need.get(ch);
            int available = window.getOrDefault(ch,0);
            if (available < required)
            return false;
        }
        return true;
    }
}
