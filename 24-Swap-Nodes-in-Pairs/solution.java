/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        for(ListNode cur = temp; cur.next != null && cur.next.next != null; cur = cur.next.next)
            cur.next = swap(cur.next, cur.next.next);
            
        return temp.next;
        
    }
    private ListNode swap(ListNode next1, ListNode next2)
    {
        next1.next = next2.next;
        next2.next = next1;
        return next2;
    }
}