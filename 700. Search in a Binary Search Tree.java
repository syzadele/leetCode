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
    public TreeNode searchBST(TreeNode root, int val) {
       if (root != null) {
           TreeNode finalTree = new TreeNode(root.val);
           findTree(root, finalTree, val, false);
           if (finalTree.val == val) {
               return finalTree;
           }  
       } 
        return null;
    }
    
    public void findTree(TreeNode tree, TreeNode finalTree, int val, boolean isFound){       
        if (tree.val == val) {
            isFound = true;
            finalTree.val = tree.val;
        }
      
        if (tree.left != null) {
            if (isFound == true) {
                finalTree.left = tree.left;
                findTree(tree.left, finalTree.left,val,isFound);
            } else {
                findTree(tree.left, finalTree,val, isFound);
            }
        }
        if (tree.right != null) {
            if (isFound == true) {
                finalTree.right = tree.right;
                findTree(tree.right, finalTree.right,val, isFound);
            } else {
                findTree(tree.right, finalTree, val,isFound);
            }
        }
    } 
        
}
