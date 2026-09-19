class Solution {
     List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        
        dfs(nums, sub,new boolean[nums.length]);
        return res;
    }
    public void dfs(int[] nums , List<Integer> sub, boolean[] pick){
        if(sub.size() == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        for( int i = 0; i< nums.length; i++){
            if(!pick[i]){
                sub.add(nums[i]);
                pick[i] = true; 
                dfs(nums, sub, pick);
                sub.remove(sub.size()-1);
                pick[i] = false;
            }
        }

    }
        

        
}
