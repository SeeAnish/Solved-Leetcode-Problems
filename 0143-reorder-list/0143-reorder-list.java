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
    public void reorderList(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode previous = slow.next = null;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = previous;
            previous = curr;
            curr = temp;
        }
        while(previous != null)
        {
            ListNode temp1 = head.next, temp2 = previous.next;
            head.next = previous;
            previous.next = temp1;
            head = temp1;
            previous = temp2;
        }
    }
}