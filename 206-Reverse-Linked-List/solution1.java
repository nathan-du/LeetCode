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
        ListNode first = head;
        ListNode second = head.next;
        head.next = null;
        while(second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        return first;
    }
}