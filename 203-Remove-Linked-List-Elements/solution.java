/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode newHead = temp;
        while(temp != null && temp.next != null) {
            ListNode p = temp.next;
            while(p != null && p.val == val) {
                p = p.next;
            }
            temp.next = p;
            temp = temp.next;
        }
        return newHead.next;
    }
}