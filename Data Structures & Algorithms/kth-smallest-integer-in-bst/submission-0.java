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
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
    public int kthSmallest(TreeNode root, int k) {
         dfs(root);
         while(pq.size() > k){
            pq.poll();
         }
         return pq.peek();
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        pq.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
