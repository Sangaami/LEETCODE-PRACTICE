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
    private Integer prev = null;
    private int count = 1;
    private int max = 0;
    private List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) {
            if (root.val == prev) {
                count++;
            } else {
                count = 1;
            }
        }

        if (count > max) {
            max = count;
            modes.clear();
            modes.add(root.val);
        } else if (count == max) {
            modes.add(root.val);
        }

        prev = root.val;

        inorder(root.right);
    }
}
