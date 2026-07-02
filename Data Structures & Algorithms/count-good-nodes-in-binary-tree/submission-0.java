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
        int count =0;
    public int goodNodes(TreeNode root) {
        int k = root.val;
        if(root == null){
            return 0;
        }
        dfs(root,k);
        return count;
    }
    private void dfs(TreeNode root,int k){
        if(root == null){
            return;
        }
        if(root.val >= k){
            count++;
        }
        int max = Math.max(root.val,k);
        dfs(root.left,max);
        dfs(root.right,max);
    }
}
