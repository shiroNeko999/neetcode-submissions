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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //go left
        if(root.val > p.val && root.val > q.val)
        return lowestCommonAncestor(root.left, p,q);
        //go right
        if(root.val < p.val && root.val < q.val)
        return lowestCommonAncestor(root.right, p,q);
        //LCA no more on same side strictly
        return root;
    }
}
