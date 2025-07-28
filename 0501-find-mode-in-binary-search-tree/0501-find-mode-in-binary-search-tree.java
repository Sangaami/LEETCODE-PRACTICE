import java.util.*;

class Solution {
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];

        List<Integer> values = new ArrayList<>();
        collect(root, values);

        Collections.sort(values);

        List<Integer> modes = new ArrayList<>();
        int freq = 1;
        int maxFreq = 1;

        // Always include the first value
        modes.add(values.get(0));

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i).equals(values.get(i - 1))) {
                freq++;
            } else {
                freq = 1;
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                modes.clear();
                modes.add(values.get(i));
            } else if (freq == maxFreq) {
                if (!modes.contains(values.get(i))) {
                    modes.add(values.get(i));
                }
            }
        }

        // Convert to array
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void collect(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        collect(node.left, list);
        collect(node.right, list);
    }
}
