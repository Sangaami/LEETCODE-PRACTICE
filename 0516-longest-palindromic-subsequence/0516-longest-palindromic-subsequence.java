class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] memo = new int[s.length()][s.length()];
        return helper(s, 0, s.length() - 1, memo);
    }

    private int helper(String s, int i, int j, int[][] memo) {
        // Base case: invalid range
        if (i > j) return 0;
        // Base case: single character
        if (i == j) return 1;

        // If already computed, return the cached result
        if (memo[i][j] != 0) return memo[i][j];

        // If matching characters
        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = 2 + helper(s, i + 1, j - 1, memo);
        } else {
            // If not matching, try both directions
            memo[i][j] = Math.max(helper(s, i + 1, j, memo), helper(s, i, j - 1, memo));
        }

        return memo[i][j];
    }
}
