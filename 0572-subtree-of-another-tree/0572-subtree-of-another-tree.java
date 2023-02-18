/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(root == null) return false;
        if(equal(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean equal(TreeNode main, TreeNode sub)
    {
        if(main == null || sub == null) return main == null && sub == null;
        if(main.val == sub.val) return equal(main.left, sub.left) && equal(main.right, sub.right);
        return false;
    }
}

// T: O(MN)
// S: O(M+N)