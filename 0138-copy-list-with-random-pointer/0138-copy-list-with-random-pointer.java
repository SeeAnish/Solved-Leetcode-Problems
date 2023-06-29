/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    Map<Node, Node> vmap = new HashMap<>();
    public Node copyRandomList(Node head) 
    {
        if(head == null) return null;
        if(vmap.containsKey(head)) return vmap.get(head);
        Node dummy = new Node(head.val, null, null);
        vmap.put(head, dummy);
        dummy.next = copyRandomList(head.next);
        dummy.random = copyRandomList(head.random);
        return dummy;
    }
}
//Time Complexity: O(N) where N is the number of nodes in the linked list.
//Space Complexity: O(N)
