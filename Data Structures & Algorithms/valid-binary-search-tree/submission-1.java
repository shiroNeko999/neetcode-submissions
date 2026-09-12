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

class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Integer.MIN_VALUE , Integer.MAX_VALUE);         
    }

    public boolean valid(TreeNode root, int min , int max){
        if( root== null) return true;

        if(!(root.val> min && root.val<max))return false;// if it is in the range

        boolean left = valid(root.left, min, root.val);// min = min , max = val of parent
        boolean right = valid( root.right, root.val , max);// min = val of parent , max = max

        return left && right;
    }
}
