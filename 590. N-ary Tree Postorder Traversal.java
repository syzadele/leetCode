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
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        if (root != null) {
            LinkedList<Node> stack = new LinkedList<Node>();
            stack.add(root);

            while(!stack.isEmpty()) {
                Node thisRoot = stack.pollLast();
                if (thisRoot.children.size() != 0) {
                    List<Node> childrenList = thisRoot.children;
                    thisRoot.children = new LinkedList<Node>();
                    stack.add(thisRoot);
                    Collections.reverse(childrenList);
                    for (Node c : childrenList) {
                        stack.add(c);
                    }
                } else {
                    result.add(thisRoot.val);
                }   
            }
        }
        return result;
    }
}
