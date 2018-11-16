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
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        result = addValue(root, result);
        return result;
    }
    public List<Integer> addValue(Node n, List<Integer> resultV) {
        if (n != null) {
            resultV.add(n.val);
            if (n.children != null) {
                for (Node c: n.children) {
                    addValue(c, resultV);
                }
            }
        }
        return resultV;
    }
}
