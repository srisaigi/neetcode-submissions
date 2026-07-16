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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            StringBuilder res1 = new StringBuilder();
            StringBuilder res2 = new StringBuilder();
            dfs(root,res1);
            dfs(subRoot,res2);
            return res1.toString().contains(res2.toString());
    }
    private void dfs(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        dfs(root.left,sb);
        dfs(root.right,sb);
    }
}
