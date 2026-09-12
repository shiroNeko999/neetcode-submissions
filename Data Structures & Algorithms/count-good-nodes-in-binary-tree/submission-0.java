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
    List<TreeNode> res = new ArrayList<>();
    int  max = Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        func(root,res,max);
        return res.size();
    }

    public void func(TreeNode node, List<TreeNode> list , int max){
        if( node == null){
            return ;
        }

        if(node.val>= max){
            max = node.val;
            list.add(node);
        }

        func(node.left, list, max);
        func(node .right, list, max);
        return;
    }
}
