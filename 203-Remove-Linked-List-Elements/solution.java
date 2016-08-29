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
        ListNode temp = head;
        if(temp.val == val) {
            temp = temp.next;
        }
        while(head.next != null) {
            
        }
        return temp;
    }
}