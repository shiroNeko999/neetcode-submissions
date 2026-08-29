class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //we have a fixed sliding window , first we shall use it to cal max 
        // then we will use this max starting from i=1, remove l , add r ,
        // is r > max , new max is r else return the same max again , 
        // we shall keep appending this max element in the list, at the end convert
        //the list to array

        //finding max value of the first window
        int prevMax = Integer.MIN_VALUE;
        int maxIndex=-1;
        for( int i = 0; i<k;i++){
            if(nums[i]>prevMax){
                prevMax = Math.max(prevMax,nums[i]);
                maxIndex = i;
            }
        }//2,2
         int it = 0;
        List<Integer> list = new ArrayList<>();
        list.add(prevMax);

        for(int r = k; r<nums.length; r++){
            int l = r-k+1;
            if(nums[r]> prevMax){
                prevMax = nums[r];
                maxIndex = r;
            }
            else if(maxIndex<l)// max has left the window
            {
                 prevMax = Integer.MIN_VALUE;

                for (int i = l; i <= r; i++) {
                    if (nums[i] > prevMax) {
                        prevMax = nums[i];
                        maxIndex = i;
                    }
                }
            }

            list.add(prevMax);  
        }

        // convert the list to array
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

        
    }
}
