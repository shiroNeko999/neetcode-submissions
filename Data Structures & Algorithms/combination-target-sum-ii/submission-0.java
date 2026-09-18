class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> sub = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        dfs(candidates, target , 0, sub , res);
        return res;
        
    }

    public void dfs(int[]nums , int target, int i , List<Integer> sub, List<List<Integer>>res){
        if(target==0){
            res.add( new ArrayList<>(sub));
            return;
        }

        if(target<0|| i>=nums.length){
            return;
        }

        //add
        sub.add(nums[i]);
        //explore (left)-> choose
        dfs(nums, target- nums[i], i+1, sub, res);
        //remove
        sub.remove(sub.size()-1);
        //right explore-> skip 
        int j = i+1;
        while( j< nums.length && nums[i]==nums[j] ){j++;}
        dfs(nums , target, j, sub, res);
    }
}
