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
    public List<Integer> rightSideView(TreeNode root) {

        if(root == null)return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){ 
            // TreeNode node = q.pollLast();
            // res.add(node.val);
            TreeNode node = q.peekLast();
            res.add(node.val);
            int len = q.size();

            for( int i = 0; i<len ;i++){
                TreeNode curr = q.poll();
                if(curr.left!= null) q.offer(curr.left);//[5]
                if(curr.right!= null) q.offer(curr.right);
            }
            
        }
return res;      
    }
}
