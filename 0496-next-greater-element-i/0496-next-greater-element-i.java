import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> idx = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) idx.put(nums2[i], i);

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;
            for (int j = idx.get(nums1[i]) + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) { ans[i] = nums2[j]; break; }
            }
        }
        return ans;
    }
}
