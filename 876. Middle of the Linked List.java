/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head != null) {
            LinkedList<ListNode> result = new LinkedList<ListNode>();
            ListNode loop = head;
            while (loop != null) {
                result.add(loop);
                loop = loop.next;
            }
            return result.get(result.size()/2);
        }
        return null;
    }
}
