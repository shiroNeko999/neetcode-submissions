class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      // Step 1: Count frequency

        Map<Integer, Integer> freqMap = new HashMap<>();
        for( int num : nums)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

      // Step 2: Create buckets
      List<Integer>[] bucket = new ArrayList[nums.length +1];
      // Step 3: Put numbers into buckets
     for(int n: freqMap.keySet())
     {
        int freq = freqMap.get(n); // frequency of that number
        if(bucket[freq]== null)
        {
            bucket[freq] = new ArrayList<>();
        }
        bucket[freq].add(n);
     }
      // Step 4: Pick numbers from highest frequency(ofc highest freq is from the end, and create a list of these numbers)
      int[] ans = new int[k];
      int index = 0;
    for(int i = bucket.length-1; i>0 ; i -- )
    {
        if(!(bucket[i]== null))
        {
            for( int num: bucket[i])
            {
                ans[index]= num;
                index ++;
            
            if(index == k)
            return ans;
            }

        }
    }
    return ans;
    }
}

     





        
