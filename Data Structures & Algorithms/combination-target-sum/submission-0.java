class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        dfs(nums, target, 0, curr, res);
        return res;
    }

    public void dfs(int[] nums, int target ,int i,  List<Integer> current, List<List<Integer>> res){
        if(target== 0){
            res.add(new ArrayList<>(current));
            return;
        }

        if(i>=nums.length || target<0){
            return;
        }

        //add 
        current.add(nums[i]);
        //explore left
        dfs(nums, target-nums[i], i, current , res);// we dont change the index as we can pick 2 multiple times
        //remove
        current.remove(current.size()-1);
        //explore right
        dfs(nums , target, i+1, current, res);
    }
}

