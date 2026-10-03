class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        dfs(0,sub, res, s);
        return res;

    }

    public void dfs(int start,List<String> sub , List<List<String>> res, String s){       
        if(start== s.length()){
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int end= start; end<s.length();end++){
            if(isPalin(s, start, end)){
                sub.add(s.substring(start, end+1));
                dfs(end+1,sub,res,s);
                sub.remove(sub.size()-1);
            }
        }
    }
    private boolean isPalin(String s , int start, int end){
        while(start<end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
