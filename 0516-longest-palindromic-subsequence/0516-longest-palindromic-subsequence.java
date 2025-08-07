class Solution {
    public int longestPalindromeSubseq(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return lcs(s, reversed);
    }

    private int lcs(String a, String b) {
        int m = a.length(), n = b.length();
        int[] prev = new int[n + 1], curr = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    curr[j] = 1 + prev[j - 1];
                else
                    curr[j] = Math.max(prev[j], curr[j - 1]);
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}
