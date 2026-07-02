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
            List<Integer> b = new ArrayList<>();
            bfs(root,b,0);
            return b;
    }
    private void bfs(TreeNode root,List<Integer> b,int level){
        if(root == null){
            return;
        }
        if(b.size() == level){
            b.add(root.val);
        }
        bfs(root.right,b,level+1);
        bfs(root.left,b,level+1);
    }
}
