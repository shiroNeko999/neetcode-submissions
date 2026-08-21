class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // first we shall find the row which has the eleement -> for that we shall use binary search on rows ( and check the first and last element of the rows)

        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bottom = ROWS-1;
        int targetRow =0;
        //this was to find the target row
        while(top<=bottom){
            int mid = (top +bottom)/2;
            if(target>matrix[mid][COLS-1]){
                top = mid +1;
            }
            else if( target< matrix[mid][0]){
                bottom = mid - 1;
            }
            else{
            targetRow = mid ;
            break;
            }
        }


        int left = 0; 
        int right = COLS-1;
        while(left<=right)
        {    int mid = (left+ right)/2;
            if(target > matrix[targetRow][mid]){
                left = mid +1;
            }
            else if( target<matrix[targetRow][mid]){
                right = mid -1;
            }
            else if(target == matrix[targetRow][mid] ){
                return true;
            }

        }
        return false;



        
        
    }
}
