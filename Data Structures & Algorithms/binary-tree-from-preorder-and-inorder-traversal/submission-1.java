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
    int preIndex =0;
    HashMap<Integer,Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode();
        int n = inorder.length;
        for(int i=0;i<n;i++){
            mp.put(inorder[i],i);
        }
        return build(preorder,0,n-1);
    }
        private TreeNode build(int[] preorder,int start,int end){
            if(start > end){
                return null;
            }
            int rootval = preorder[preIndex++];
            TreeNode root = new TreeNode(rootval);
            int mid = mp.get(rootval);
            root.left = build(preorder,start,mid-1);
            root.right = build(preorder,mid+1,end);
            return root;
        }
}
