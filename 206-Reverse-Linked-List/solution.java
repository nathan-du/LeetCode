/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        LinkedList<ListNode> linkedList = new LinkedList<ListNode> ();
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        while(newHead.next != null) {
            linkedList.push(newHead.next);
            newHead = newHead.next;
        }
        ListNode res = newHead;
        while(linkedList.peek() != null) {
            newHead.next = linkedList.pop();
            newHead = newHead.next;
        }
        return res;
    }
}