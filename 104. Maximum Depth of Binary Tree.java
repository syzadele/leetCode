/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int maxLeft = 0;
        int maxRight = 0;
        
        if (root != null) {
            maxLeft ++ ;
            maxRight ++ ;
            if (root.left != null) {
                maxLeft = maxDepth(root.left) + 1;
            }
            
            if (root.right != null) {
                maxRight = maxDepth(root.right) + 1;
            }
        } 
        return Math.max(maxLeft, maxRight);
    }
}
