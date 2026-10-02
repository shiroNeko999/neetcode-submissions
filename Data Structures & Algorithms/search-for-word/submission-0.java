class Solution {
    public boolean exist(char[][] board, String word) {
       // here we shall visit all the board letters one by one
       for( int r = 0; r< board.length; r++){
        for(int c = 0; c<board[0].length; c++){
             if(dfs(r,c,0,board,word)) return true;
        }
       }
       return false;
    }

    public boolean dfs(int r, int c , int i, char[][]board , String word){
        if(i == word.length()){
            return true;
        }

        if(r<0|| c<0 || r>=board.length|| c>=board[0].length|| board[r][c]!= word.charAt(i)) return false;//most imp condition

        char temp = board[r][c];

        board[r][c]= '*';// we have visited this box
//explore 4 directions 
        boolean found = dfs(r+1,c , i+1, board, word)||dfs(r-1,c , i+1, board, word)||dfs(r,c+1 , i+1, board, word)||dfs(r,c-1 , i+1, board, word);

        //backtrack and restore
        board[r][c] = temp;

        return found;

    }
}
