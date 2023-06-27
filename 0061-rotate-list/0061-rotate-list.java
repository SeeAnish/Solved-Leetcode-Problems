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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || k == 0 || head.next == null) return head;
        ListNode rotate = head;
        int count = 1;
        while(rotate.next != null) 
        {
            rotate = rotate.next;
            count++;
        }
        rotate.next = head;
        k %= count;
        for(int i = 0; i < count - k; i++)
            rotate = rotate.next;
        head = rotate.next;
        rotate.next = null;
        return head;
    }
}
// Time Complexity: O(N);
//Space Complexity: O(N);