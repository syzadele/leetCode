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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if (root.left != null || root.right != null) {
        
            Map<Integer, Double> levelMap = new HashMap<Integer, Double>();
            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
            saveLevel(levelMap, countMap, root, 1);

            for (int level : levelMap.keySet()) {
                result.add((double)(levelMap.get(level)/countMap.get(level)));
            }
            return result;
        } else {
            result.add((double)root.val);
            return result;
        }
    }
    
    public void saveLevel (Map<Integer, Double> m, Map<Integer, Integer>m1,TreeNode node, int level) {
        
        if (node != null && (node.left != null || node.right != null)) {
            
            if (level == 1 ) {
                m.put(1,(double)node.val);
                m1.put(1,1);
            }
            
            level++;
            double left = node.left != null ? node.left.val : 0.0;
            double right = node.right != null ? node.right.val : 0.0;
            m.put(level, m.getOrDefault(level, 0.0) + left + right);
            
            
            int left1 = node.left != null ? 1 : 0;
            int right1 = node.right != null ? 1 : 0;
            m1.put(level, m1.getOrDefault(level, 0) + left1 + right1);
            
            
            saveLevel(m, m1, node.left, level);
            saveLevel(m, m1, node.right, level);
            
        } 
    }
}
