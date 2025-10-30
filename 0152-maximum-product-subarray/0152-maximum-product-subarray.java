class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;
        int ps = 1;
        int pe = 1;
        int max = Integer.MIN_VALUE;

        while (st < n) {
            ps *= nums[st];
            pe *= nums[end];
            max = Math.max(max, Math.max(ps, pe));

            if (ps == 0) ps = 1;
            if (pe == 0) pe = 1;

            st++;
            end--;
        }

        return max;
    }
}