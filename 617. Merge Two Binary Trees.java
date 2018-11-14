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
    public void nextTree(TreeNode finalTree, TreeNode tree1, TreeNode tree2) {
        if (tree1 != null && tree2 != null) {
            if (tree1.left != null || tree2.left != null) {
                finalTree.left = new TreeNode((tree1.left != null ? tree1.left.val : 0) + (tree2.left != null ? tree2.left.val : 0));
                nextTree(finalTree.left, tree1.left, tree2.left);
            }
            
            if (tree1.right != null || tree2.right != null) {
                finalTree.right = new TreeNode((tree1.right != null ? tree1.right.val : 0) + (tree2.right != null ? tree2.right.val : 0));
                 nextTree(finalTree.right, tree1.right, tree2.right);
            }
        } else if (tree2 != null) {
            if (tree2.left != null) {
                finalTree.left = new TreeNode(tree2.left.val);
                nextTree(finalTree.left, null, tree2.left);
            }
            if (tree2.right != null) {
                finalTree.right = new TreeNode(tree2.right.val);
                nextTree(finalTree.right, null, tree2.right);
            }   
        } else if (tree1 != null) {
            if (tree1.left != null) {
                finalTree.left = new TreeNode(tree1.left.val);
                nextTree(finalTree.left, tree1.left, null);
            }
            if (tree1.right != null) {
                finalTree.right = new TreeNode(tree1.right.val);
                nextTree(finalTree.right, tree1.right, null);
            }   
        } 
        
    }
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode finalTree = null;
        if (t1 != null || t2 != null) {
            finalTree = new TreeNode((t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0));
            nextTree(finalTree, t1, t2);
        } 
       
        return finalTree;   
    }
}
