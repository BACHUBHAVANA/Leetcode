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
    public int diameterOfBt(TreeNode root,int[] di)
    {
        if(root==null)return 0;
        int left = diameterOfBt(root.left,di);
        int right = diameterOfBt(root.right,di);
        di[0] = Math.max(di[0],left+right);
        return 1+Math.max(left,right); 
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] di = new int[1];
        diameterOfBt(root,di);
        return di[0];
    }
}