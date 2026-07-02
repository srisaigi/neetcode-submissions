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
    public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return root;
            }  
            dfs(root);
            return root;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode temp = p;
        p = q;
        q = temp;
        root.left = p;
        root.right = q;
        dfs(root.left);
        dfs(root.right);
    }
}
