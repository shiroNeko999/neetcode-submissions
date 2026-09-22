class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        String sub ="";
        backtrack(n, 0 , 0, new StringBuilder(),res);
        return res;
    }

    public void backtrack(int n, int open , int close , StringBuilder sub, List<String> res){

        //basecase-> close and open ==n 
        if(close== n && open ==n){
            res.add(sub.toString());
            return;
        }
        //if(open<n)
        if(open<n)// which means its correct till now
        {
            //add
            sub.append("(");
            //explore and increase open
            backtrack(n, open+1, close, sub, res);
            //remove
            sub.deleteCharAt(sub.length()-1);
        }
         // if( close<open)
         if(close<open){
            sub.append(")");
            backtrack(n, open, close+1, sub, res);
            sub.deleteCharAt(sub.length()-1);
         }

    }
}
