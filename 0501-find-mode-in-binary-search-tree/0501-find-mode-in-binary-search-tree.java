import java.util.*;

class Solution {
    private Integer prev = null;
    private int count = 1;
    private int max = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        // Convert list to array
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        // Process current node
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
