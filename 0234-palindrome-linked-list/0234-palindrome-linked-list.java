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
    public boolean isPalindrome(ListNode head) 
    {
        List vals = new ArrayList<>();
        List rvals = new ArrayList<>();
        int i = 0;
        while(head != null)
        {
            vals.add(head.val);
            head = head.next;
        }
        for(int j = vals.size() -1; j >= 0; j--) rvals.add(vals.get(j));
        for(int j = vals.size() -1; j >= 0; j--) if(vals.get(j) != rvals.get(j)) return false;
        return true;
    }
}
// Time Complexity: O(N)
//Space Complexity: O(N)