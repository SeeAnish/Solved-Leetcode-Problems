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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists == null || lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        int size = lists.length;
        int interval = 1;
        while (interval < size) 
        {
            for (int i = 0; i < size - interval; i += 2 * interval)
                lists[i] = mergetwo(lists[i], lists[i + interval]);
            interval *= 2;
        }
        return lists[0];
    }
    private ListNode mergetwo(ListNode l1, ListNode l2)
    {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head;
        if(l1.val < l2.val)
        {
            head = l1;
            l1 = l1.next;
        }
        else
        {
            head = l2;
            l2 = l2.next;
        }
        head.next = mergetwo(l1, l2);
        return head;
    }
}