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
        
        if(headA == null || headB == null) return null;
        ListNode tempA = headA;
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        
        while(tempA != null){
            hashSet.add(tempA);
            tempA = tempA.next;
        }
        
        ListNode tempB = headB;
        
        while(tempB != null){
            if(hashSet.contains(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        
        return null;
    }
}