/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = p1.next;
        ListNode pre = p1;
        while(p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            pre = p1;
            p1 = p3;
            p3 = p1.next;
            p1.next = pre;
        }
        if(p2.next == null) p1 = p1.next;
        
        while(p3 != null) {
            if(p3.val != p1.val) return false;
            p3 = p3.next;
            p1 = p1.next;
        }
        return true;
    }
}