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
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null)
        return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.offer(root); int level = 0;

        while(!q.isEmpty()){
            
            int size = q.size();
            res.add(new ArrayList<>());// list addition for new level
           for(int i =0; i< size; i++){//for loop for each level
            TreeNode curr = q.poll();
            res.get(level).add(curr.val);

            if(curr.left!= null) q.offer(curr.left);
            if(curr.right!= null) q.offer(curr.right);
           }
        level++;//upgrade level after each for loop ends

        }
        return res;
        
    }
}
