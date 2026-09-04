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
    public int maxDepth(TreeNode root) {
        int max = 0;
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
        return 0;
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int levelSize = q.size();//1
           
           
           for( int i =0; i< levelSize;i++){
            TreeNode curr =  q.poll();
            if(curr.left!= null){
            q.offer(curr.left);
           }
           if(curr.right!= null){
            q.offer(curr.right);
           }
        }
           level++;//3

        }

        return level;

    }
   
}
