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
public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode hare = headA;
        ListNode rabbit = headB;
        while(hare != rabbit)
        {
            hare = hare != null ? hare.next : headB;
            rabbit = rabbit != null ? rabbit.next : headA;
        }
        return hare;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)