class Solution {
    public int[] twoSum(int[] nums, int target) {

        //we shall go with the needed approach here , form
        //a hashmap with need = target -n[i], if for other number , need is in map then
        //take the current number and the key of the difference already present

        HashMap<Integer, Integer> outMap = new HashMap<>();
        int needed;
        for( int i = 0; i< nums.length; i++){
            needed = target - nums[i];
            if( outMap.containsKey(needed)){
               return new int[]{outMap.get(needed),i};
            }
            outMap.put(nums[i], i);// we store index and not needed

        }
        return new int[]{};
    }

}
