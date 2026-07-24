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
    //TreeNode root = new TreeNode();
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1,root2);
    }
    private TreeNode dfs(TreeNode root1,TreeNode root2){
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        int val1 = root1.val;
        int val2 = root2.val;
        int sum = val1 + val2;
        TreeNode root = new TreeNode(sum);
        root.left = dfs(root1.left,root2.left);
        root.right = dfs(root1.right,root2.right);
        return root; 
    }
}