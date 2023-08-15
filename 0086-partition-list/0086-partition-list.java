/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public ListNode partition(ListNode head, int x) 
    {
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode left = less;
        ListNode right = more;
        while(head != null)
        {
            if(head.val < x)
            {
                left.next = head;
                left = left.next;
            }
            else 
            {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        left.next = more.next;
        right.next = null;
        return less.next;
    }
}
//Time Complexity: O(N);
//Space Complexity: O(1);