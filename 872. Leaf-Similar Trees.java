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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafSequence1 = new ArrayList<Integer>();
        List<Integer> leafSequence2 = new ArrayList<Integer>();
        if(findLeafSequence(root1, leafSequence1).equals(findLeafSequence(root2, leafSequence2))) {
            return true;
        }
        return false;
    }
    
    public List<Integer> findLeafSequence(TreeNode root, List<Integer> loopList) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                loopList.add(root.val);
            } else {
                findLeafSequence(root.left, loopList);
                findLeafSequence(root.right, loopList);
            }
        }
        return loopList;
    }
}
