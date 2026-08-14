class Solution {
    public int longestConsecutive(int[] nums) {

       Set<Integer> numbers = new HashSet<>();
        int longest = 0;
       for(int num: nums)
       {
        numbers.add(num);
       }

       for(int num: numbers)
       {
        if(!(numbers.contains(num-1)))
        {
            int length = 1;

            while(numbers.contains(num+1))
            {
                num++;
                length++;
            }

             longest = Math.max(longest, length);
        }

       }



       return longest;


        


    }
}
