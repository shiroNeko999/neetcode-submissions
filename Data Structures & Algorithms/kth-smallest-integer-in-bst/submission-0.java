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
    int count = 0;
    int result = -1;
    public int kthSmallest(TreeNode root, int k) {
        func(root,k);
        return result;
    }
    public void func(TreeNode node, int target){
        if(node== null) return;

        func(node.left, target);//go as left as possible

        count++;//then start counting

        if(count == target){
            result = node.val;
            return;
        }
        func(node.right,target);
    }
}
