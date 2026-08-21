class Solution {
    public int largestRectangleArea(int[] heights) {

        Deque<Integer> stack = new ArrayDeque<>();// we are storing the indexes here

        int maxArea = 0;
        for( int i = 0; i< heights.length; i ++){
            
            int currentElement = heights[i];
            while(!stack.isEmpty() && heights[i]< heights[stack.peek()])
            {
                //if smaller element then pop the element and compute its width and then area
                int h = heights[stack.pop()];
        int width; 

                if(stack.isEmpty())
                {
                    width = i;
                }
                else{
                    width = i- stack.peek()-1;
                }   

                maxArea = Math.max(maxArea, h* width);
               


            }

             stack.push(i);// push only after every popping has been done
        }
         while(!stack.isEmpty())//[1,2,3]
            {
                //if smaller element then pop the element and compute its width and then area
                int h = heights[stack.pop()];
                int width;
                if(stack.isEmpty())
                {
                    width = heights.length;
                }
                else{
                    width = heights.length- stack.peek()-1;
                }   
                maxArea = Math.max(maxArea, h* width);

            }
            return maxArea; 
        
    }
}
