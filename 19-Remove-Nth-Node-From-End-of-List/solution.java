/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0)
        {
            return head;
        }
        if(head == null)
        {
            return head;
        }
        int depth = getDepth(head);
        ListNode point = head;
        if(depth < n)
        {
            return head;
        }
        if(depth == n)
        {
            head = head.next;
            return head;
        }
        else
        {
            for(int i = 1; i <= depth; i++)
            {
                if(i == depth - n)
                {
                    ListNode temp = point.next;
                    point.next = temp.next;
                    break;
                }
                point = point.next;
            }
            return head;
        }
    }
    
    public int getDepth(ListNode head)
    {
        int depth = 0;
        while(head != null)
        {
            head = head.next;
            depth++;
        }
        return depth;
    }
}