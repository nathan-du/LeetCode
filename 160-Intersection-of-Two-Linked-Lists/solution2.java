/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        
        while(lenA < lenB){
            headB = headB.next;
            lenB--;
        }
        
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    public int length(ListNode temp){
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}