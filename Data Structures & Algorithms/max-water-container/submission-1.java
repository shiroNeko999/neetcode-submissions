class Solution {
    public int maxArea(int[] heights) {

        int water=0;

        int i = 0;
        int j = heights.length-1;
        while(i<j){
            int w = j-i;
            int h = Math.min(heights[j],heights[i]);
            water = Math.max(water, w*h);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        
        }
        return water;

        
    }
}
