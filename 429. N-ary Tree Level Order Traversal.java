/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> listResult = new ArrayList<List<Integer>>();
        if (root == null) {
            return listResult;
        }
        
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(root.val);
        listResult.add(first);
        loopThroughTree(listResult, root, 1);
        
        return listResult;
    }
    
    public void loopThroughTree(List<List<Integer>> listResult, Node root, int level) {
        if (root != null) {
            if (root.children != null) {
                level++;
                for (Node ch : root.children) {
                    List<Integer> loop;
                    if (listResult.size() >= level) {
                        loop = listResult.get(level - 1);
                        loop.add(ch.val);  
                    } else {
                        loop = new ArrayList();
                        loop.add(ch.val);  
                        listResult.add(loop);
                    }
                    loopThroughTree(listResult, ch, level);
                }
            }
        }
    }
}
