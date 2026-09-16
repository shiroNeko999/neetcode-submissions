class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subs = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        dfs(nums , 0, subs , res);
        return res;
    }

    public void dfs(int[] nums , int i , List<Integer>subset, List<List<Integer>> res){
        //base case
        if(i>= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        //add
        subset.add(nums[i]);
        //explore
        dfs(nums, i+1, subset, res);
        //remove
        subset.remove(subset.size()-1);
        //explore
        dfs(nums, i+1, subset , res);
    }
}
