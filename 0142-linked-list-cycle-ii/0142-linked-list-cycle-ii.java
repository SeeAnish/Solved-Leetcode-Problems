/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next == null) return null;
        ListNode intersect = getintersect(head);
        if(intersect == null) return null;
        ListNode conjunction = head;
        while(intersect != conjunction)
        {
            intersect = intersect.next;
            conjunction = conjunction.next;
        }
        return conjunction;
    }
    private ListNode getintersect(ListNode head)
    {
        ListNode hare = head;
        ListNode turtle = head;
        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle) return turtle;
        }
        return null;
        
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1)