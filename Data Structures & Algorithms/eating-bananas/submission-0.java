class Solution {
    public int minEatingSpeed(int[] piles, int h) {


    
    int maxK = 0;
    for( int num: piles){
        maxK = Math.max(maxK, num);
    }

    
    int minK = maxK;
    int left = 1; int right = maxK;
    while(left<= right){
        int mid = left + (right-left)/2;
        int sumHour = 0;
        for( int i = 0; i< piles.length; i++){
            sumHour += (int)Math.ceil((double)piles[i]/mid);
        }
        if( sumHour> h){
            left = mid+1;
        }
        else {
            minK = mid;
            right = mid -1;
            
        }
    }
    return minK;
    }

}
