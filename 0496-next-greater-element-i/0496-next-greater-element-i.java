import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] ans = new int[len1];
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // Store index of each element in nums2
        for (int i = 0; i < len2; i++) {
            indexMap.put(nums2[i], i);
        }

        // For each element in nums1, search in nums2 from next index
        for (int i = 0; i < len1; i++) {
            int target = nums1[i];
            int startIndex = indexMap.get(target) + 1;
            int nextGreater = -1;

            for (int j = startIndex; j < len2; j++) {
                if (nums2[j] > target) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }

        return ans;
    }
}
