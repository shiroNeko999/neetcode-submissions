/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// bohot neend aari but i have to solve this  , hopefully i crack a great job, 3:40 , SEPT 14
class Solution {
    int globalMax= Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        //CONCEPT: return the best path - node+ max(left,right) but
        //update global max with node + left+ right

         dfs(root);

        return globalMax;

    }

    public int dfs(TreeNode node){
        if(node == null) return 0;
        
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        int currSum = node.val + left + right;
        globalMax = Math.max(globalMax, currSum);

        return node.val + Math.max(left,right);
    }


}
