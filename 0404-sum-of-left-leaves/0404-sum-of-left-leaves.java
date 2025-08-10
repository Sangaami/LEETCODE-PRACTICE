class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return add(root);
    }

    public int add(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        sum += add(root.left);
        sum += add(root.right);

        return sum;
    }
}
