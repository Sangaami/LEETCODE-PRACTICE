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
class Solution {
    int r = 0; 
    int maxDepth = -1;

    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        height(l, root, 0);
        return r;
    }

    public void height(ArrayList<Integer> l, TreeNode root, int depth) {
        if (root == null) return;

        if (depth > maxDepth) {
            maxDepth = depth;
            r = root.val;
        }
        l.add(root.val);
        height(l, root.left, depth + 1);
        height(l, root.right, depth + 1);
    }
}
