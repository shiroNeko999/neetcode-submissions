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
    Map<Integer, Integer> inMap;
    int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inMap = new HashMap<>();
        for(int i = 0; i< inorder.length ; i++){
            inMap.put(inorder[i], i);
        }

        TreeNode result = build(preorder,0, inorder.length-1 );
        return result;
    }

    private TreeNode build(int[] preorder, int left , int right){

        if(left> right)return null;

        int rootVal = preorder[preorderIndex++];

        TreeNode root = new TreeNode(rootVal);
        int mid = inMap.get(rootVal);
        // for last leaf node , left will be > right so return null , left and right for that node will be built null , then we finally return root of that call

        root.left = build(preorder,left, mid-1 );
        root.right = build(preorder, mid+1 , right);
        return root;

    }







}
